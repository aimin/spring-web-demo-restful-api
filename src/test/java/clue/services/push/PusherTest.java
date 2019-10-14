package clue.services.push;

import clue.dao.ClClueDao;
import clue.dao.ClUtilDao;
import clue.model.ClClue;
import clue.model.ClUtil;
import clue.model.ClUtilExample;
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

        ClClue c = list.get(list.size()-1);

        System.out.println(DateTime.now().plusDays(-3).getMillis());
        System.out.println(DateTime.now().getMillis());
    }

}
