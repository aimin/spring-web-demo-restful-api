package clue.dao;

import clue.model.ClClue;
import clue.model.ClClueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}
