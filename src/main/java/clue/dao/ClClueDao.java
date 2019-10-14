package clue.dao;

import clue.model.ClClue;
import clue.model.ClClueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ClClueDao extends C_IfDao {
    long countByExample(ClClueExample example);

    int deleteByExample(ClClueExample example);

    int deleteByPrimaryKey(Long clId);

    int insert(ClClue record);

    int insertSelective(ClClue record);

    List<ClClue> selectByExampleWithBLOBs(ClClueExample example);

    List<ClClue> selectByExample(ClClueExample example);

    ClClue selectByPrimaryKey(Long clId);

    int updateByExampleSelective(@Param("record") ClClue record, @Param("example") ClClueExample example);

    int updateByExampleWithBLOBs(@Param("record") ClClue record, @Param("example") ClClueExample example);

    int updateByExample(@Param("record") ClClue record, @Param("example") ClClueExample example);

    int updateByPrimaryKeySelective(ClClue record);

    int updateByPrimaryKeyWithBLOBs(ClClue record);

    int updateByPrimaryKey(ClClue record);


    @Select("select cl_id as clId, cl_type as clType, cl_status as clStatus, createtime, lasttime," +
            " cl_link_mob as clLinkMob, cl_link_man as clLinkMan, cl_lo as clLo, \n" +
            "    cl_la as clLa from cl_clue cu where cl_id>#{cl_id} and createtime>#{date} " +
            "and not exists (select 1 from cl_push_log cpl where cpl.cl_id=cu.cl_id and status>-1) order by cl_id asc limit #{num};")
    List<ClClue> selectNotPush(@Param("cl_id") long cl_id,@Param("date") long date,@Param("num") int num);

}
