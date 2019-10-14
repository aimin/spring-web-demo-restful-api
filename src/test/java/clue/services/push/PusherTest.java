package clue.services.push;

import clue.dao.ClClueDao;
import clue.dao.ClUtilDao;
import clue.model.ClClue;
import clue.model.ClTradeOrg;
import clue.model.ClUtil;
import clue.model.ClUtilExample;
import clue.services.ClueSrv;
import clue.services.OrgSrv;
import keywords.SamApplication;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SamApplication.class)
public class PusherTest {

    @Resource
    ClUtilDao clUtilDao;

    @Resource
    ClClueDao clClueDao;

    @Resource
    ClueSrv clueSrv;

    @Resource
    OrgSrv orgSrv;



    @Test
    public void a(){


//        ClUtil clUtil = new ClUtil();
//        clUtil.setIdstr("pushing_max_clid");
//        clUtil.setValue("-1"); //初始值是-1，之后为未处理的起始cl_id
//        clUtil.setRemart("正在推送的最clid值，以协助多线程乐观锁推送");
//        clUtil.setCreatetime(DateTime.now().getMillis());
//        clUtil.setLasttime(DateTime.now().getMillis());
//        clUtilDao.insert(clUtil);

//        ClUtil clUtil = clUtilDao.selectByPrimaryKey((long)1);
//        ClUtilExample clUtilExample = new ClUtilExample();
//        ClUtilExample.Criteria c = clUtilExample.createCriteria();
//        c.andIdstrEqualTo(clUtil.getIdstr());
//        c.andValueEqualTo(clUtil.getValue());
//        clUtil.setValue(new Long(500).toString());
//        int n = clUtilDao.updateByExampleSelective(clUtil,clUtilExample);
//        assert n>0;

        List<ClClue> list = clClueDao.selectNotPush(44,DateTime.now().plusDays(-3).getMillis(),200);
        assert list.size()>0;

    }


    @Resource
    PreClCues pcs;

    @Test
    public void push(){
        //创建机构
        ClTradeOrg cto = new ClTradeOrg();
        cto.setOname("小宋维修服务中心");
        cto.setLinkman("小贺贺");
        cto.setLinkman("18731049653");
        cto.setChkDupUrl("http://xxx.com");
        cto.setPushUrl("http://xxx.com/p");
        cto.setPushSecret("xxxxxxxxx");
        cto = orgSrv.Add(cto);
        assert cto.getOid()>0;

        //创新线索
        ClClue c = new ClClue();
        c.setClType(1);
        c.setClStatus(1);
        c.setClDesc("室内保洁");
        c.setClLinkMob("13552528388");
        c.setClLinkMan("王菲");
        clueSrv.Add(c);
        assert (c.getClId()>0);

        //线索推送给机构
        clueSrv.DoPush();
    }

}
