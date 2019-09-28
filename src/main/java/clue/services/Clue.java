package clue.services;

import clue.dao.ClClueDao;
import clue.model.ClClue;
import clue.model.ClClueExample;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;


@Service
public class Clue {

    @Resource
    ClClueDao cce;

    @Transactional
    public ClClue[] Add(ClClue[] cs){

        for(ClClue c:cs){
            int id = cce.insert(c);
            c.setClId((long)id);
        }

        return cs;
    }



    public  void test1(){
        System.out.println(8888);
    }
}
