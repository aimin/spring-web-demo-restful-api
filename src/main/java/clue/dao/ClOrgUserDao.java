package clue.dao;

import clue.model.ClOrgUser;
import clue.model.ClOrgUserExample;
import clue.model.ClOrgUserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClOrgUserDao {
    long countByExample(ClOrgUserExample example);

    int deleteByExample(ClOrgUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClOrgUserWithBLOBs record);

    int insertSelective(ClOrgUserWithBLOBs record);

    List<ClOrgUserWithBLOBs> selectByExampleWithBLOBs(ClOrgUserExample example);

    List<ClOrgUser> selectByExample(ClOrgUserExample example);

    ClOrgUserWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClOrgUserWithBLOBs record, @Param("example") ClOrgUserExample example);

    int updateByExampleWithBLOBs(@Param("record") ClOrgUserWithBLOBs record, @Param("example") ClOrgUserExample example);

    int updateByExample(@Param("record") ClOrgUser record, @Param("example") ClOrgUserExample example);

    int updateByPrimaryKeySelective(ClOrgUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClOrgUserWithBLOBs record);

    int updateByPrimaryKey(ClOrgUser record);
}