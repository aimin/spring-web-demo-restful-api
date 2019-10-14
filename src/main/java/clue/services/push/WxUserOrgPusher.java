package clue.services.push;

import clue.dao.ClPushLogDao;
import clue.model.*;
import clue.services.OrgSrv;
import clue.util.C_Result;
import org.joda.time.DateTime;

import javax.annotation.Resource;
import java.util.List;


/**
 * 推送给机构的微信用户消息，并建立消息与机构的推送记录跟踪
 */
public class WxUserOrgPusher extends BasePusher {



    @Resource
    ClPushLogDao clPushLogDao;

    @Resource
    OrgSrv orgSrv;

    List<ClTradeOrg> clTradeOrgs;


    @Override
    /**
     * 检查推送记录是否重复
     */
    public boolean CheckDuplication(ClClue clClue) {
        if(!(clClue.getClId()>0)){
            return false;
        }
        for(ClTradeOrg clTradeOrg:clTradeOrgs){
            //检查推送是否重复
            ClPushLogExample cple = new ClPushLogExample();
            ClPushLogExample.Criteria c = cple.createCriteria();
            c.andOidEqualTo(clTradeOrg.getOid());
            c.andClIdEqualTo(clClue.getClId());
            c.andStatusGreaterThan(new Integer(-1).byteValue());
            List<ClPushLog> list = clPushLogDao.selectByExample(cple);
            if(list.size()>0){
                //重复移除
                clTradeOrgs.remove(clTradeOrg);
            }
        }
        if(clTradeOrgs.size()>0){
            return true;
        }
        return false;
    }

    /**
     * 创建推送记录
     * @param clClue
     */
    @Override
    public void Push(ClClue clClue) {
        //创建推送记录
        for (ClTradeOrg org:clTradeOrgs){
            ClPushLog cpl = new ClPushLog();
            cpl.setCreatetime(DateTime.now().getMillis());
            cpl.setLasttime(DateTime.now().getMillis());
            cpl.setStatus(new Integer(0).byteValue());
            cpl.setClId(clClue.getClId());
            cpl.setOid(org.getOid());
            int n = clPushLogDao.insert(cpl);
            if(n>0){
                this.wxMsgPush(org,clClue);
            }
        }
    }

    /**
     * 随机取3个机构为推送准备
     * @return
     */
    private List<ClTradeOrg> getOrgs(){
        ClTradeOrgExample ctoe = new ClTradeOrgExample();
        ctoe.setOrderByClause("order by RAND()");
        ClTradeOrgExample.Criteria c = ctoe.createCriteria();
        c.andStatusEqualTo(new Integer(1).byteValue());
        C_Result<ClTradeOrg> re = orgSrv.GetList(0,3,ctoe);
        return re.list;
    }

    /**
     *
     * @param org
     * @param clClue
     */
    private void wxMsgPush(ClTradeOrg org,ClClue clClue){
        //todo 找出机构的微信用户，并实现微信推送
    }


}
