package keywords.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import keywords.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


/*
* http://localhost:8989/swagger-ui.html 查看接口文档
* */
@Api(description = "好词服务")
@RestController
public class HelloWorld {

    @ApiOperation(value = "入门示例")
    @GetMapping(value = "/json")
    public List<Integer> json() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        return list;
    }

    @ApiOperation(value = "上行body-json参数")
    @ApiImplicitParam(name = "request-body", value = "请求实体", paramType = "body", required = true, dataType = "keywords.clue.model.User")
    @RequestMapping(value = "/json-up",method = RequestMethod.POST)
    public User json2(@RequestBody User r){
        return r;
    }

    @ApiOperation(value = "post参数接收demo")
    @ApiImplicitParams(value = {
            @ApiImplicitParam( name = "uid", value = "用户id", paramType = "query", required = true, dataType = "String")
            ,@ApiImplicitParam( name = "username", value = "用户名", paramType = "query", required = true, dataType = "String")
    })
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public User json3(@RequestParam String username,@RequestParam Integer uid){
        User u = new User();
        u.setUsername(username);
        u.setUid(uid);
        return u;
    }


    @ApiOperation(value = "restful 入门示例")
    @GetMapping(value = "/hello")
//    @PostMapping(value = "/hello")
//    @RequestMapping(value = "/hello")
    public String index() {
        return "Hello World";
    }


}
