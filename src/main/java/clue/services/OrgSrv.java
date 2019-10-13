package clue.services;

import clue.dao.ClOrgUserDao;
import clue.dao.ClTradeOrgDao;
import clue.model.*;
import clue.util.C_Result;
import clue.util.C_Tool;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrgSrv {
    @Resource
    ClTradeOrgDao clTradeOrgDao;

    @Resource
    ClOrgUserDao clOrgUserDao;


    /**
     * 添加机构
     * @param clTradeOrg
     * @return
     */
    public ClTradeOrg Add(ClTradeOrg clTradeOrg){

        clTradeOrg.setCreatetime(DateTime.now().getMillis());
        clTradeOrg.setLasttime(DateTime.now().getMillis());
        clTradeOrg.setStatus(new Integer(1).byteValue());
        int id = clTradeOrgDao.insert(clTradeOrg);
        if(id>0){
            return clTradeOrg;
        }

        return null;
    }

    /**
     * 添加用户到机构
     * @param oid
     * @param uid
     * @return
     */
    public ClOrgUser AddUser(int oid,long uid){
        if(oid<0 || uid<0){
            return null;
        }
        ClOrgUser cloub = new ClOrgUser();
        cloub.setOid(oid);
        cloub.setUid(uid);
        cloub.setCreatetime(DateTime.now().getMillis());
        cloub.setLasttime(DateTime.now().getMillis());
        int id =clOrgUserDao.insert(cloub);
        if(id>0){
            return cloub;
        }
        return null;
    }

    /**
     * 移除机构中的用户
     * @param oid
     * @param uid
     * @return
     */
    public int DelUser(int oid,long uid){
        if(oid<0 || uid<0){
            return 0;
        }
        ClOrgUserExample coue = new ClOrgUserExample();
        ClOrgUserExample.Criteria c = coue.createCriteria();
        c.andOidEqualTo(oid);
        c.andUidEqualTo(uid);

        int n =clOrgUserDao.deleteByExample(coue);

        return n;
    }


    /**
     * 逻辑删除机构
     * @param oid
     * @return
     */
    public int Del(int oid){
        ClTradeOrg clTradeOrg = new ClTradeOrg();
        clTradeOrg.setOid(oid);
        clTradeOrg.setStatus(new Integer(-1).byteValue());
        clTradeOrg.setLasttime(DateTime.now().getMillis());
        return this.Update(clTradeOrg);
    }


    /**
     * 更新机构信息
     * @param clTradeOrg
     * @return
     */
    public int Update(ClTradeOrg clTradeOrg){
        if(!(clTradeOrg.getOid()>0)){
            return 0;
        }
        clTradeOrg.setLasttime(DateTime.now().getMillis());
        int n = clTradeOrgDao.updateByPrimaryKeySelective(clTradeOrg);
        return n;
    }

    /**
     * 分页条件查询机构
     * @param page
     * @param number
     * @param ctoe
     * @return
     */
    public C_Result<ClTradeOrg> GetList(Integer page, Integer number, ClTradeOrgExample ctoe){
        return  C_Tool.GetList(page,number,clTradeOrgDao,ctoe);
    }

    /**
     * 分页获取机构列表
     * @param page   页码
     * @param number  每页条数
     * @return  List<ClTradeOrg>
     */
    public C_Result<ClTradeOrg> GetList(Integer page,Integer number){
        ClTradeOrgExample coe = new ClTradeOrgExample();
        coe.setOrderByClause("oid desc");
        return this.GetList(page,number,coe);
    }

    /**
     * 机构id查询
     * @param oid
     * @return  List<ClTradeOrg>
     */
    public C_Result<ClTradeOrg> GetList(int oid){
        if(oid<0){
            return new C_Result<>();
        }
        ClTradeOrgExample coe = new ClTradeOrgExample();
        ClTradeOrgExample.Criteria c = coe.createCriteria();
        c.andOidEqualTo(oid);

        return this.GetList(0,10,coe);
    }

    /**
     * 联系人查询机构
     * @param linkman
     * @return  List<ClTradeOrg>
     */
    public C_Result<ClTradeOrg> GetListByLinkMan(String linkman){
        if(linkman.isEmpty()){
            return new C_Result<>();
        }
        ClTradeOrgExample coe = new ClTradeOrgExample();
        ClTradeOrgExample.Criteria c = coe.createCriteria();
        c.andLinkmanEqualTo(linkman);

        return this.GetList(0,10,coe);
    }

    /**
     * 联系电话查询机构
     * @param linktel
     * @return  List<ClTradeOrg>
     */
    public C_Result<ClTradeOrg> GetListByLinktel(String linktel){
        if(linktel.isEmpty()){
            return new C_Result<>();
        }
        ClTradeOrgExample coe = new ClTradeOrgExample();
        ClTradeOrgExample.Criteria c = coe.createCriteria();
        c.andLinktelEqualTo(linktel);

        return this.GetList(0,10,coe);
    }

    /**
     * id,联系人，联系电话 查询机构
     * @param page
     * @param number
     * @param oid_Linkman_Linktel
     * @return
     */
    public C_Result<ClTradeOrg> GetListByOidLinkManLinkTel(int page,int number,String oid_Linkman_Linktel){
        if(oid_Linkman_Linktel.isEmpty()){
            return new C_Result<>();
        }

        ClTradeOrgExample coe = this.getClTradeOrgExample(oid_Linkman_Linktel);
        return this.GetList(page,number,coe);
    }

    private ClTradeOrgExample getClTradeOrgExample(String oidLinkmanLinktel){
        ClTradeOrgExample coe = new ClTradeOrgExample();
        ClTradeOrgExample.Criteria c = coe.createCriteria();
        if(C_Tool.CheckMobileFormat(oidLinkmanLinktel)){
            c.andLinktelEqualTo(oidLinkmanLinktel);
        }
        else if(C_Tool.IsNumeric(oidLinkmanLinktel)){
            c.andOidEqualTo(new Integer(oidLinkmanLinktel));
        }else {
            c.andLinkmanEqualTo(oidLinkmanLinktel);
        }
        return coe;
    }





}
