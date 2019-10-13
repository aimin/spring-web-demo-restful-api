package clue.dao;

import clue.model.ClTradeOrg;
import clue.model.ClTradeOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClTradeOrgDao {
    long countByExample(ClTradeOrgExample example);

    int deleteByExample(ClTradeOrgExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(ClTradeOrg record);

    int insertSelective(ClTradeOrg record);

    List<ClTradeOrg> selectByExample(ClTradeOrgExample example);

    ClTradeOrg selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") ClTradeOrg record, @Param("example") ClTradeOrgExample example);

    int updateByExample(@Param("record") ClTradeOrg record, @Param("example") ClTradeOrgExample example);

    int updateByPrimaryKeySelective(ClTradeOrg record);

    int updateByPrimaryKey(ClTradeOrg record);
}