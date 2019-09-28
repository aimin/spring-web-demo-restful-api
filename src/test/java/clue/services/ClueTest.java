package clue.services;

import clue.model.ClClue;
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
public class ClueTest {

    @Resource
    Clue s_service;

    @Test
    public void add() {
        ClClue c = new ClClue();
        c.setClType(1);
        c.setClStatus(1);


        DateTime time = new DateTime(new Date());

        c.setCreatetime(time.toDate());
        c.setLasttime(time.toDate());
        c.setClDesc("捷达205");
        c.setClLinkMob("13552528384");
        c.setClLinkMan("张振军");


        ClClue[] cs = s_service.Add(new ClClue[]{c});

        assert (cs[0].getClId()>0);
    }
}