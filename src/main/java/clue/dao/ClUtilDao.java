package clue.dao;

import clue.model.ClUtil;
import clue.model.ClUtilExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClUtilDao {
    long countByExample(ClUtilExample example);

    int deleteByExample(ClUtilExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClUtil record);

    int insertSelective(ClUtil record);

    List<ClUtil> selectByExample(ClUtilExample example);

    ClUtil selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClUtil record, @Param("example") ClUtilExample example);

    int updateByExample(@Param("record") ClUtil record, @Param("example") ClUtilExample example);

    int updateByPrimaryKeySelective(ClUtil record);

    int updateByPrimaryKey(ClUtil record);
}