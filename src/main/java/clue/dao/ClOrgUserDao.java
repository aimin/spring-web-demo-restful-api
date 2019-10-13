package clue.dao;

import clue.model.ClOrgUser;
import clue.model.ClOrgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClOrgUserDao {
    long countByExample(ClOrgUserExample example);

    int deleteByExample(ClOrgUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClOrgUser record);

    int insertSelective(ClOrgUser record);

    List<ClOrgUser> selectByExample(ClOrgUserExample example);

    ClOrgUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClOrgUser record, @Param("example") ClOrgUserExample example);

    int updateByExample(@Param("record") ClOrgUser record, @Param("example") ClOrgUserExample example);

    int updateByPrimaryKeySelective(ClOrgUser record);

    int updateByPrimaryKey(ClOrgUser record);
}