package clue.services.push;

import clue.dao.ClClueDao;
import clue.dao.ClUtilDao;
import clue.model.ClClue;
import clue.model.ClClueExample;
import clue.model.ClUtil;
import clue.model.ClUtilExample;
import clue.services.ClueSrv;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 预处理列表
 */
@Service
public class PreClCues{

    protected List<ClClue> preClClues; //预备处理数据列表

    @Resource
    ClClueDao clClueDao;

    @Resource
    ClUtilDao clUtilDao;

    ClUtil clUtil;

    //乐观锁开始
    private void optLockStart(){
        String idstr = "pushing_max_clid";
        ClUtilExample clUtilExample = new ClUtilExample();
        ClUtilExample.Criteria c = clUtilExample.createCriteria();
        c.andIdstrEqualTo(idstr);
        List<ClUtil> list = clUtilDao.selectByExample(clUtilExample);
        if(list.size()<1){
            //新建锁key
            clUtil = new ClUtil();
            clUtil.setIdstr(idstr);
            clUtil.setValue("-1"); //初始值是-1，之后为未处理的起始cl_id
            clUtil.setRemart("正在推送的最clid值，以协助多线程乐观锁推送");
            clUtil.setCreatetime(DateTime.now().getMillis());
            clUtil.setLasttime(DateTime.now().getMillis());
            clUtilDao.insert(clUtil);
        }else{
            clUtil = list.get(0);
        }
    }

    //乐观锁检查
    private boolean optLockIsValid(long max_cl_id){
        ClUtilExample clUtilExample = new ClUtilExample();
        ClUtilExample.Criteria c = clUtilExample.createCriteria();
        c.andIdstrEqualTo(clUtil.getIdstr());
        c.andValueEqualTo(clUtil.getValue());
        clUtil.setValue(new Long(max_cl_id).toString());
        int n = clUtilDao.updateByExampleSelective(clUtil,clUtilExample);
        if(n>0){
            return true;
        }
        return false;
    }

    //初始化预推线索列表
    private void InitPreClues(){
        //从数据库读取200条
        int n =0;
        while(n<100){
            n++;
            this.optLockStart();
            this.preClClues = this.getClClues();
            if(this.preClClues.size()<1){
                return ;
            }
            long max_cl_id = this.preClClues.get(this.preClClues.size()-1).getClId();
            if(!this.optLockIsValid(max_cl_id)){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }
            break;
        }
    }

    /**
     * 取出200条数据
     * @return
     */
    private List<ClClue> getClClues(){
        List<ClClue> list = clClueDao.selectNotPush(new Long(clUtil.getValue()),DateTime.now().plusDays(-3).getMillis(),200);
        return list;
    }

    /**
     * 执行推送
     * @param pusher
     * @return
     */
    public int DoPush(BasePusher pusher){
        this.InitPreClues();
        if(this.preClClues.size()>0){
            for (ClClue clClue:this.preClClues) {
                if(!pusher.CheckDuplication(clClue)){//调用pusher检查重复
                    pusher.Push(clClue);//调用pusher执行推送
                }
            }
        }
        return 0;
    }

}
