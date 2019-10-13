package clue.services;

import clue.dao.ClTradeOrgDao;
import clue.model.ClOrgUser;
import clue.model.ClTradeOrg;
import clue.util.C_Result;
import keywords.SamApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SamApplication.class)
public class OrgSrvTest {

    @Resource
    OrgSrv orgSrv;

    @Resource
    ClTradeOrgDao clTradeOrgDao;


    @Test
    public void add() {
        ClTradeOrg cto = new ClTradeOrg();
        cto.setOname("小宋维修服务中心");
        cto.setLinkman("小贺贺");
        cto.setLinkman("18731049653");
        cto.setChkDupUrl("http://xxx.com");
        cto.setPushUrl("http://xxx.com/p");
        cto.setPushSecret("xxxxxxxxx");
        cto = orgSrv.Add(cto);

        assert cto.getOid()>0;

    }

    @Test
    public void updateOrgUser(){
        ClOrgUser cou = orgSrv.AddUser(2,5);
        assert cou.getId() > 0;

        int n = orgSrv.DelUser(2,5);
        assert n>0;
    }

    @Test
    public void update() {
        ClTradeOrg cto = new ClTradeOrg();
        cto.setOname("小宋维修服务中心");
        cto.setLinkman("小贺贺");
        cto.setLinktel("18731049653");
        cto.setChkDupUrl("http://xxx.com");
        cto.setPushUrl("http://xxx.com/p");
        cto.setPushSecret("xxxxxxxxx");
        cto = orgSrv.Add(cto);
        int oid1 = cto.getOid();
        cto = orgSrv.Add(cto);

        int n = orgSrv.Del(cto.getOid());
        assert n>0;

        cto.setStatus(new Integer(1).byteValue());
        n = orgSrv.Update(cto);
        assert n>0;

        this.getList();



        n = clTradeOrgDao.deleteByPrimaryKey(cto.getOid());
        assert n>0;

        n = clTradeOrgDao.deleteByPrimaryKey(oid1);
        assert n>0;



    }

    @Test
    public void getList() {

        C_Result<ClTradeOrg> re =  orgSrv.GetList(0,2);
        assert re.list.get(0).getOid()>0;
        assert re.list.size()>1;

        int oid = re.list.get(0).getOid();
        re =  orgSrv.GetList(oid);
        assert re.list.size()>0;


        re = orgSrv.GetListByLinktel(re.list.get(0).getLinktel());
        assert re.list.size()>0;

        re = orgSrv.GetListByLinkMan(re.list.get(0).getLinkman());
        assert re.list.size()>0;

        re = orgSrv.GetListByOidLinkManLinkTel(0,10,re.list.get(0).getOid().toString());
        assert re.list.size()>0;

        re = orgSrv.GetListByOidLinkManLinkTel(0,10,re.list.get(0).getLinktel());
        assert re.list.size()>0;

        re = orgSrv.GetListByOidLinkManLinkTel(0,10,re.list.get(0).getLinkman());
        assert re.list.size()>0;


    }
}
