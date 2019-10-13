package clue.services;

import clue.model.ClClue;
import clue.util.C_Result;
import keywords.SamApplication;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SamApplication.class)
public class ClueSrvTest {

    @Resource
    ClueSrv clueSrv;

    @Test
    public void add() {
        ClClue c = new ClClue();
        c.setClType(1);
        c.setClStatus(1);
        c.setClDesc("捷达205");
        c.setClLinkMob("13552528384");
        c.setClLinkMan("张振军");


        ClClue[] cs = clueSrv.Add(new ClClue[]{c});

        assert (cs[0].getClId()>0);
    }


    @Test
    public void TestGetList(){
        C_Result<ClClue> re = clueSrv.GetList(0,2);
        assert(re.count>0);
        long cl_id = re.list.get(0).getClId();

        re = clueSrv.GetList(0,1,1);
        assert(re.count>0);

        re = clueSrv.GetList(cl_id);
        assert(re.count>0);

    }
}
