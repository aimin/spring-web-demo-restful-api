package clue.services;

import clue.dao.ClUserDao;
import clue.model.ClUser;
import clue.model.ClUserExample;
import clue.util.C_Tool;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service
public class UserSrv {

    @Resource
    ClUserDao clUserDao;

    public ClUser WxLogin(String wxCode){
        //todo 根据wxcode换取openid,accesstoken
        //todo 检查openid是否存在,以决定更新还是新建用户


        return new ClUser();
    }

    public ClUser MobLogin(String mobCode){
        //todo 手机验证码code是否有效
        //todo 检查手机号是否存在，以决定更新或新建用户

        return new ClUser();
    }

    public ClUser EmailLogin(String EmailCode){
        //todo 邮箱登录
        return new ClUser();
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

        List<ClUser> list = clUserDao.selectByExample(cue);
        ClUser user = list.get(0);
        if(user.getPassword().equals(C_Tool.Md5(pwd))){
            //检查密码
            return user;
        }

        return null;
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
            user.setUid(id);
            return user;
        }

        return null;
    }


}





