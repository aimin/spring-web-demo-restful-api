package clue.services;

import clue.dao.ClClueDao;
import clue.model.ClClue;
import clue.model.ClClueExample;
import org.apache.ibatis.session.SqlSession;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


@Service
public class ClueSrv {

    @Resource
    ClClueDao clue_dao;

    /**
     * 添加线索
     * @param cs
     * @return
     */
    @Transactional
    public ClClue[] Add(ClClue[] cs){

        for(ClClue c:cs){
            c.setCreatetime(DateTime.now().getMillis());
            c.setLasttime(DateTime.now().getMillis());
            int id = clue_dao.insert(c);
            c.setClId((long)id);
        }

        return cs;
    }

    /**
     * 逻辑删除
     * @param clid
     * @return
     */
    public boolean Del(int clid){
        ClClue clue = clue_dao.selectByPrimaryKey((long)clid);
        return true;
    }
    @Transactional
    public boolean Del(ClClue clue){
        clue.setClStatus(-1);
        int n = clue_dao.updateByPrimaryKey(clue);
        return n>0;
    }

    /**
     * 条件查询列表
     * @return
     */
    public ClClue[] getList(){
        ClClueExample cce = new ClClueExample();



        ClClueExample.Criteria c = cce.createCriteria();




        return new ClClue[]{};
    }





    public  void test1(){
        System.out.println(8888);
    }
}
