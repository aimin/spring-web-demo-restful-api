package clue.controller;

import clue.model.ClClue;
import clue.services.ClueSrv;
import clue.services.floor.VerifyUtil;
import clue.util.C_JSON_Result;
import clue.util.C_Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
* http://localhost:8989/swagger-ui.html 查看接口文档
* */
@Api(description = "线索接口")
@RestController
public class Clue {

    @Resource
    ClueSrv clueSrv;

    @ApiOperation(value = "线索列表")
    @ApiImplicitParams(value = {
            @ApiImplicitParam( name = "page", value = "页码", paramType = "path", required = true, dataType = "int")
            ,@ApiImplicitParam( name = "num", value = "每页条数", paramType = "path", required = true, dataType = "int")
//            ,@ApiImplicitParam( name = "curid", value = "当前游标id", paramType = "path", required = false, dataType = "long")
            ,@ApiImplicitParam( name = "authorization", value = "用户授权token", paramType = "header", required = true, dataType = "String")
    })
    @GetMapping("/clues/{page}/{num}")
    public C_JSON_Result clues(@PathVariable("page") int page, @PathVariable("num") int num){
        C_JSON_Result r = new C_JSON_Result();
        C_Result<ClClue> cr = clueSrv.GetList(page,num);
        r.data = cr;
        return r;
    }

    @ApiOperation(value = "线索创建")
    @ApiImplicitParams(value = {
            @ApiImplicitParam( name = "clClue", value = "线索信息", paramType = "body", required = true, dataType = "ClClue"),
            @ApiImplicitParam( name = "authorization", value = "用户授权token", paramType = "header", required = true, dataType = "String")
    })
    @PostMapping("/clue")
    public C_JSON_Result create(@RequestBody ClClue clClue){
        C_JSON_Result r = new C_JSON_Result();
        if(clClue.getClLinkMob().isEmpty()){
            r.SetReturnCode(20001);
            return r;
        }
        if(clClue.getClType()==null){
            r.SetReturnCode(20002);
            return r;
        }

        clClue.setClStatus(1);
        clClue = clueSrv.Add(clClue);
        r.data = clClue;
        return r;
    }


}
