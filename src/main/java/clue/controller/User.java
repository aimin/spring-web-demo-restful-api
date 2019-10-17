package clue.controller;

import clue.model.ClUser;
import clue.services.UserSrv;
import clue.services.floor.VerifyUtil;
import clue.util.C_JSON_Result;
import clue.util.C_Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.repository.core.support.SurroundingTransactionDetectorMethodInterceptor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*
* http://localhost:8989/swagger-ui.html 查看接口文档
* */
@Api(description = "用户接口")
@RestController
public class User {

    @Resource
    UserSrv userSrv;

    @Resource
    VerifyUtil verifyUtil;

    @ApiOperation(value = "登录")
    @ApiImplicitParams(value = {
        @ApiImplicitParam( name = "uname", value = "用户名", paramType = "query", required = true, dataType = "String")
        ,@ApiImplicitParam( name = "pwd", value = "密码", paramType = "query", required = true, dataType = "String")
        ,@ApiImplicitParam( name = "verifyCode", value = "验证码", paramType = "query", required = true, dataType = "String")
    })
    @PostMapping(value = "/login")
    public C_JSON_Result Login(HttpServletRequest request, HttpServletResponse response, @RequestParam("uname") String username, @RequestParam("pwd") String pwd, @RequestParam("verifyCode") String code) {
        C_JSON_Result r = new C_JSON_Result();
        //检查验证码
        if(!verifyUtil.chkRandcode(request,code)){
            r.SetReturnCode(10001);
            return r;
        }

        ClUser user = userSrv.PasswordLogin(username,pwd);
        if(user==null){
            r.SetReturnCode(10002);
            return r;
        }

        r.data =  this.userToMap(user);
        return r;
    }

    /**
     * 登录后生成用户信息
     * @param user
     * @return
     */
    private HashMap<String,Object> userToMap(ClUser user){
        HashMap<String,Object> map = new HashMap<>();
        map.put("uid",user.getUid());
        map.put("username",user.getUsername());
        map.put("mobile",user.getMobile());
        map.put("email",user.getEmail());
        map.put("third_openid",user.getThirdOpenid());
        String token = userSrv.UserToToken(user);
        map.put("token",token);
        return map;
    }


    @ApiOperation(value = "用户信息")
    @ApiImplicitParams(value = {
            @ApiImplicitParam( name = "id", value = "用户id", paramType = "path", required = true, dataType = "Long"),
            @ApiImplicitParam( name = "authorization", value = "用户授权token", paramType = "header", required = true, dataType = "String")
    })
    @GetMapping(value = "/user/{id:\\d+}")
    public C_JSON_Result info(@PathVariable Long id) {

        C_JSON_Result r = new C_JSON_Result();
        r.data=id.toString();



        return r;
    }

}
