package clue.services;

import clue.dao.ClTradeOrgDao;
import clue.model.ClTradeOrg;
import org.joda.time.DateTime;

import javax.annotation.Resource;

public class OrgSrv {
    @Resource
    ClTradeOrgDao clTradeOrgDao;

    public ClTradeOrg Add(ClTradeOrg clTradeOrg){
        clTradeOrg.setCreatetime(DateTime.now().toDate());
        return null;
    }
}
