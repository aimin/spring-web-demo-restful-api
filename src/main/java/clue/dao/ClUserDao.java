package clue.dao;

import java.util.List;
import clue.model.ClUser;
import clue.model.ClUserExample;
import org.apache.ibatis.annotations.Param;

public interface ClUserDao {
    long countByExample(ClUserExample example);

    int deleteByExample(ClUserExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(ClUser record);

    int insertSelective(ClUser record);

    List<ClUser> selectByExample(ClUserExample example);

    ClUser selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") ClUser record, @Param("example") ClUserExample example);

    int updateByExample(@Param("record") ClUser record, @Param("example") ClUserExample example);

    int updateByPrimaryKeySelective(ClUser record);

    int updateByPrimaryKey(ClUser record);
}