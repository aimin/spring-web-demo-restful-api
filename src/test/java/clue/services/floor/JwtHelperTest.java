package clue.services.floor;

import clue.SamApplication;
import io.jsonwebtoken.Claims;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SamApplication.class)
public class JwtHelperTest {

    @Resource
    JwtHelper jwtHelper;

    @Test
    public void TestC() throws InterruptedException {

        //生成token
        Map<String,Object> map = new HashMap<>();
        map.put("userid",1);
        map.put("username","sam");
        String token = JwtHelper.generateToken(map);

        //校验并解析token
        Claims c = JwtHelper.verifyJwt(token);
        assert (int)c.get("userid") == 1;//token有效
        token = token+"adfasdfaf";
        c = JwtHelper.verifyJwt(token);
        assert c==null;//token有误

        //生成token,时效性测试
        map = new HashMap<>();
        map.put("userid",2);
        map.put("username","sam");
        token = JwtHelper.generateToken(map,(long)5000);
        Thread.sleep(4000);
        c = JwtHelper.verifyJwt(token);
        assert (int)c.get("userid") == 2;//有效期内
        Thread.sleep(2000);
        c = JwtHelper.verifyJwt(token); //超期
        assert c==null;

        System.out.println(token);
    }
}
