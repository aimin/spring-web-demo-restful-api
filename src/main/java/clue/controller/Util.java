package clue.controller;

import clue.services.floor.RedisService;
import clue.services.floor.VerifyUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
* http://localhost:8989/swagger-ui.html 查看接口文档
* */
@Api(description = "系统杂项接口")
@RestController
public class Util {


    @Resource
    VerifyUtil verifyUtil;



    /**
     * @author songaimin@outlook.com
     */
    @GetMapping("/createImg")
    @ApiOperation(value = "图像验证码生成")
    public void createImg(HttpServletRequest request, HttpServletResponse response) throws Exception {
        verifyUtil.genCode(request,response);

    }






//    @ApiOperation(value = "入门示例")
//    @GetMapping(value = "/json")
//    public List<Integer> json() {
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        return list;
//    }
//
//    @ApiOperation(value = "上行body-json参数")
//    @ApiImplicitParam(name = "request-body", value = "请求实体", paramType = "body", required = true, dataType = "keywords.clue.model.User")
//    @RequestMapping(value = "/json-up",method = RequestMethod.POST)
//    public User json2(@RequestBody User r){
//        return r;
//    }
//
//    @ApiOperation(value = "post参数接收demo")
//    @ApiImplicitParams(value = {
//            @ApiImplicitParam( name = "uid", value = "用户id", paramType = "query", required = true, dataType = "String")
//            ,@ApiImplicitParam( name = "username", value = "用户名", paramType = "query", required = true, dataType = "String")
//    })
//    @RequestMapping(value = "/post",method = RequestMethod.POST)
//    public User json3(@RequestParam String username,@RequestParam Integer uid){
//        User u = new User();
//        u.setUsername(username);
//        u.setUid(uid);
//        return u;
//    }


//    @ApiOperation(value = "restful 入门示例")
//    @GetMapping(value = "/hello")
////    @PostMapping(value = "/hello")
////    @RequestMapping(value = "/hello")
//    public String index() {
//        return "Hello World";
//    }


    @ApiOperation(value = "restful 入门示例")
    @RequestMapping("/")
    public String index() {
        return "你好欢迎光临小蓝鹊后台";
    }


}
