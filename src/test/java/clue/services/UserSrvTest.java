package clue.services;

import clue.model.ClUser;
import clue.util.C_Result;
import clue.util.C_Tool;
import keywords.SamApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SamApplication.class)
public class UserSrvTest {

    @Resource
    UserSrv userSrv;

    @Test
    public void TestUserAdd() {
        ClUser user = new ClUser();
        user.setUsername("sam");
        user.setPassword(C_Tool.Md5("cccccc"));
        user = userSrv.Add(user);
        assert user.getUid()>0;

        user = new ClUser();
        user.setMobile("13552528384");
        user.setPassword(C_Tool.Md5("cccccc"));
        user = userSrv.Add(user);
        assert user.getUid()>0;

        user = new ClUser();
        user.setEmail("samxx8@163.com");
        user.setPassword(C_Tool.Md5("cccccc"));
        user = userSrv.Add(user);
        assert user.getUid()>0;
    }

    @Test
    public void TestCheckMail(){
        String email="s3am@xxx.com";
        assert C_Tool.CheckMailFormat(email);

        String mob = "13552528384";
        assert C_Tool.CheckMobileFormat(mob);

        assert C_Tool.GetRandomNumber(6).length()==6;
        assert C_Tool.GetRandomString(10).length()==10;

    }

    @Test
    public void TestUserLogin(){
        ClUser user = userSrv.PasswordLogin("sam","cccccc");
        assert user.getUid()>0;

        user = userSrv.PasswordLogin("13552528384","cccccc");
        assert user.getUid()>0;

        user = userSrv.PasswordLogin("samxx8@163.com","cccccc");
        assert user.getUid()>0;


        user = userSrv.PasswordLogin("sam","ccccccx");
        assert user==null;
    }

    @Test
    public void TestUserUpdate(){
        ClUser user = userSrv.PasswordLogin("sam","cccccc");
        user.setMobile("13888665555");
        int n = userSrv.Update(user);
        assert n>0;
    }

    @Test
    public void TestGetList(){
        C_Result<ClUser> re = userSrv.GetList(25);
        assert re.list.get(0).getUid()>0;

        re = userSrv.GetList(0,2);
        assert re.list.get(0).getUid()>0;


        re = userSrv.GetList(0,2,1);
        assert re.list.get(0).getUid()>0;


    }
}
