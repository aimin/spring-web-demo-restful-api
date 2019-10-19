package clue.util;

import java.util.HashMap;

public class C_JSON_Result {
    public int code=0;
    public String msg="";
    public Object data=null;


    public void SetReturnCode(int code){
        HashMap<Integer,String> map = getErrorsMap();
        this.setCode(code);
        this.setMsg(map.get(code));
    }

    private void setCode(int code) {
        this.code = code;
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private HashMap<Integer,String> getErrorsMap(){
        HashMap<Integer,String> map=new HashMap<Integer, String>(){};
        map.put(0,"成功！"); //默认消息不输出
        map.put(10001,"登录验证码错误！");
        map.put(10002,"登录信息有误，登录失败！");
        map.put(10003,"token无效");


        map.put(20001,"线索联系人电话不能为空");
        map.put(20002,"线索类型不能为空");

        return map;
    }



}
