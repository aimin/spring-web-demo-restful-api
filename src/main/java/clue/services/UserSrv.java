package clue.services;

import clue.dao.ClOrgUserDao;
import clue.dao.ClUserDao;
import clue.model.*;
import clue.util.C_Result;
import clue.util.C_Tool;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class UserSrv {

    @Resource
    ClUserDao clUserDao;

    @Resource
    ClOrgUserDao clOrgUserDao;

    public ClUser WxLogin(String wxCode){
        //todo 根据wxcode换取openid,accesstoken
        //todo 检查openid是否存在,以决定更新还是新建用户


        return null;
    }

    public ClUser MobLogin(String mobCode){
        //todo 手机验证码code是否有效
        //todo 检查手机号是否存在，以决定更新或新建用户

        return null;
    }

    public ClUser EmailLogin(String EmailCode){
        //todo 邮箱登录
        return null;
    }


    /**
     * 用户名/邮箱/手机号 及 密码登录
     * @param usernameMobEmail
     * @param pwd
     * @return
     */
    public ClUser PasswordLogin(String usernameMobEmail,String pwd){

        if(usernameMobEmail.isEmpty() || pwd.isEmpty()){
            return null;
        }

        ClUserExample cue = this.getExampleCriteria(usernameMobEmail);

        List<ClUser> list = clUserDao.selectByExample(cue);
        ClUser user = list.get(0);
        if(user.getPassword().equals(C_Tool.Md5(pwd))){
            //检查密码
            return user;
        }

        return null;
    }

    /**
     * 启用用户
     * @param uid
     */
    public void Enable(long uid){
        if(uid<0){
            return;
        }
        ClUser user = new ClUser();
        user.setUid(uid);
        user.setStatus(new Integer(1).byteValue());
        this.Update(user);
    }

    /**
     * 禁用用户
     * @param uid
     */
    public void Disable(long uid){
        if(uid <0 ){
            return;
        }
        ClUser user = new ClUser();
        user.setUid(uid);
        user.setStatus(new Integer(-1).byteValue());
        this.Update(user);
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public int Update(ClUser user){
        if(!(user.getUid()>0)){
            return 0;
        }
        user.setLasttime(DateTime.now().getMillis());
        return clUserDao.updateByPrimaryKeySelective(user);
    }




    /**
     * 添加用户
     * @param user
     * @return user或null
     */
    public ClUser Add(ClUser user){

        user.setCreatetime(DateTime.now().getMillis());
        user.setLasttime(DateTime.now().getMillis());
        user.setStatus(new Integer(1).byteValue());

        long id = clUserDao.insert(user);
        if(id>0){
            return user;
        }

        return null;
    }


    /**
     * 分页条件查询
     * @param page
     * @param number
     * @param cue
     * @return
     */
    public C_Result<ClUser> GetList(Integer page, Integer number, ClUserExample cue){
        return  C_Tool.GetList(page,number,clUserDao,cue);
    }

    /**
     * 用户id查询
     * @param uid
     * @return  List<ClClue>
     */
    public C_Result<ClUser> GetList(long uid){
        if(uid<0){
            return new C_Result<>();
        }
        ClUserExample cue = new ClUserExample();
        ClUserExample.Criteria c = cue.createCriteria();
        c.andUidEqualTo(uid);

        return this.GetList(0,10,cue);
    }

    /**
     * 分页获取列表
     * @param page   页码
     * @param number  每页条数
     * @return  List<ClClue>
     */
    public C_Result<ClUser> GetList(Integer page,Integer number){
        ClUserExample cue = new ClUserExample();
        cue.setOrderByClause("uid desc");
        return this.GetList(page,number,cue);
    }

    /**
     * 线索状态分页查询
     * @param page   页码
     * @param number  每页条数
     * @param status 状态值 1启用 2禁用
     * @return  List<ClClue>
     */
    public C_Result<ClUser> GetList(Integer page,Integer number,Integer status){

        ClUserExample cue = new ClUserExample();
        ClUserExample.Criteria c = cue.createCriteria();
        c.andStatusEqualTo(status.byteValue());
        return this.GetList(page,number,cue);
    }


    /**
     * 注册时间 区间查询
     * @param page
     * @param number
     * @param stime
     * @param etime
     * @return
     */
    public C_Result<ClUser> GetList(Integer page,Integer number,String stime,String etime){
        ClUserExample cue = new ClUserExample();
        ClUserExample.Criteria c = cue.createCriteria();

        long startTime = 0;
        long endTime = 0;
        try {
            startTime = C_Tool.DateStrToLong(stime);
            endTime = C_Tool.DateStrToLong(etime);
        } catch (ParseException e) {
            return new C_Result<>();
        }

        c.andCreatetimeBetween(startTime,endTime);
        return this.GetList(page,number,cue);
    }

    /**
     * 用户名、手机号、邮箱查询
     * @param usernameMobEmail
     * @return
     */
    public C_Result<ClUser> GetList(int page,int number,String usernameMobEmail){
        return this.GetList(page,number,this.getExampleCriteria(usernameMobEmail));
    }

    /**
     * 识别 username,mobile,email 查询条件
     * @param usernameMobEmail
     * @return
     */
    private ClUserExample getExampleCriteria(String usernameMobEmail){
        ClUserExample cue = new ClUserExample();
        ClUserExample.Criteria c = cue.createCriteria();
        if(C_Tool.CheckMailFormat(usernameMobEmail)){
            //email及密码地址登录
            c.andEmailEqualTo(usernameMobEmail);
        }
        else if(C_Tool.CheckMobileFormat(usernameMobEmail)){
            //手机号密码登录
            c.andMobileEqualTo(usernameMobEmail);
        }
        else{
            //用户名及密码username登录
            c.andUsernameEqualTo(usernameMobEmail);
        }

        return cue;

    }


    /**
     * 查询机构用户
     * @param page
     * @param number
     * @param oid   机构id
     * @return
     */
    public C_Result<ClUser> GetListByOid(int page,int number,int oid){

        if(oid<0 || number<1){
            return new C_Result<>();
        }

        ClOrgUserExample coe = new ClOrgUserExample();
        ClOrgUserExample.Criteria c1 = coe.createCriteria();
        c1.andOidEqualTo(oid);
        List<ClOrgUser> clOrgUsers = clOrgUserDao.selectByExample(coe);
        List<Long> uids = new ArrayList<>();
        for (ClOrgUser clOrgUser:clOrgUsers) {
            uids.add(clOrgUser.getUid());
        }

        ClUserExample cue = new ClUserExample();
        ClUserExample.Criteria c = cue.createCriteria();
        c.andUidIn(uids);

        return this.GetList(page,number,cue);
    }


}





