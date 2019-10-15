package clue.services.push;

import clue.dao.ClClueDao;
import clue.dao.ClUtilDao;
import clue.model.ClClue;
import clue.model.ClTradeOrg;
import clue.services.ClueSrv;
import clue.services.OrgSrv;
import clue.SamApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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
