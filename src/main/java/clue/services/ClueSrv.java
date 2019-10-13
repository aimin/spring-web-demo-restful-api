package clue.services;

import clue.dao.ClClueDao;
import clue.model.ClClue;
import clue.model.ClClueExample;
import clue.util.C_Result;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;


@Service
public class ClueSrv {

    @Resource
    ClClueDao clue_dao;

    /**
     * 添加线索
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
        int n = clue_dao.updateByPrimaryKey(clue);
        return n;
    }

    /**
     * 分页条件查询
     * @param page
     * @param number
     * @param cce
     * @return
     */
    public C_Result<ClClue> GetList(Integer page, Integer number,ClClueExample cce){
        if(number<=0){
            return new C_Result<ClClue>();
        }

        page = (page<2?0:page);

        cce.setOffset((long)(page*number));
        cce.setLimit(number);
        List<ClClue> list= clue_dao.selectByExample(cce);

        C_Result result = new C_Result<ClClue>();
        result.list = list;
        result.count = clue_dao.countByExample(cce);
        result.pageCount = (long)Math.ceil((double)result.count/number);

        return result;
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








    public  void test1(){
        System.out.println(8888);
    }
}
