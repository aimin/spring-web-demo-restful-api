package clue.dao;

import clue.model.ClPushLog;
import clue.model.ClPushLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClPushLogDao {
    long countByExample(ClPushLogExample example);

    int deleteByExample(ClPushLogExample example);

    int deleteByPrimaryKey(Long pid);

    int insert(ClPushLog record);

    int insertSelective(ClPushLog record);

    List<ClPushLog> selectByExample(ClPushLogExample example);

    ClPushLog selectByPrimaryKey(Long pid);

    int updateByExampleSelective(@Param("record") ClPushLog record, @Param("example") ClPushLogExample example);

    int updateByExample(@Param("record") ClPushLog record, @Param("example") ClPushLogExample example);

    int updateByPrimaryKeySelective(ClPushLog record);

    int updateByPrimaryKey(ClPushLog record);
}