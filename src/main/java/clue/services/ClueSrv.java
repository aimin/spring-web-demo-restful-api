package clue.services;

import clue.dao.ClClueDao;
import clue.model.ClClue;
import clue.model.ClClueExample;
import clue.services.push.PreClCues;
import clue.services.push.WxUserOrgPusher;
import clue.util.C_Result;
import clue.util.C_Tool;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class ClueSrv {

    @Resource
    ClClueDao clue_dao;
    @Resource
    PreClCues preClCues;
    @Resource
    WxUserOrgPusher wxUserOrgPusher;

    /**
     * 批量添加线索
     * @param clClues
     * @return
     */
    public ClClue[] Add(ClClue[] clClues){

        for(ClClue c:clClues){
            c.setCreatetime(DateTime.now().getMillis());
            c.setLasttime(DateTime.now().getMillis());
            int id = clue_dao.insert(c);
            c.setClId((long)id);
        }

        return clClues;
    }

    /**
     * 添加线索
     * @param clClue
     * @return
     */
    public ClClue Add(ClClue clClue){
        clClue.setCreatetime(DateTime.now().getMillis());
        clClue.setLasttime(DateTime.now().getMillis());
        int id = clue_dao.insert(clClue);
        clClue.setClId((long)id);
        int n = clue_dao.insert(clClue);
        if(n>0){
            return clClue;
        }
        return null;
    }


    /**
     * 逻辑删除
     * @param cl_id
     * @return 影响行数
     */
    public int Del(long cl_id){
        if(cl_id<0){
            return 0;
        }

        ClClue clue = new ClClue();
        clue.setClId(cl_id);
        clue.setClStatus(-1);
        clue.setLasttime(DateTime.now().getMillis());
        int n = clue_dao.updateByPrimaryKey(clue);
        return n;
    }

    /**
     * 批量逻辑删除
     * @param cl_ids
     */
    public void Del(long[] cl_ids){
        for (long cl_id:cl_ids) {
            this.Del(cl_id);
        }
    }

    /**
     * 分页条件查询
     * @param page
     * @param number
     * @param cce
     * @return
     */
    public C_Result<ClClue> GetList(Integer page, Integer number,ClClueExample cce){
        return  C_Tool.GetList(page,number,clue_dao,cce);
    }

    /**
     * 线索id查询
     * @param cl_id
     * @return  List<ClClue>
     */
    public C_Result<ClClue> GetList(long cl_id){
        if(cl_id<0){
            return new C_Result<ClClue>();
        }
        ClClueExample cce = new ClClueExample();
        ClClueExample.Criteria c = cce.createCriteria();
        c.andClIdEqualTo(cl_id);

        return this.GetList(0,10,cce);
    }

    /**
     * 分页获取列表
     * @param page   页码
     * @param number  每页条数
     * @return  List<ClClue>
     */
    public C_Result<ClClue> GetList(Integer page,Integer number){
        ClClueExample cce = new ClClueExample();
        cce.setOrderByClause("cl_id desc");
        return this.GetList(page,number,cce);
    }

    /**
     * 线索状态分页查询
     * @param page   页码
     * @param number  每页条数
     * @param cl_status 状态值
     * @return  List<ClClue>
     */
    public C_Result<ClClue> GetList(Integer page,Integer number,int cl_status){
        ClClueExample cce = new ClClueExample();
        ClClueExample.Criteria c = cce.createCriteria();
        c.andClStatusEqualTo(cl_status);
        return this.GetList(page,number,cce);
    }


    /**
     * 执行推送线索到机构
     */
    public void DoPush(){
        preClCues.DoPush(wxUserOrgPusher);
    }

}
