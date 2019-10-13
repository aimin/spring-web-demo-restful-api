package clue.util;

import clue.dao.C_IfDao;
import clue.model.C_IfExample;
import clue.model.ClClue;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class C_Tool {

    //md5盐值
    private static final String slat = "sam20191013";

    /**
     * 生成md5
     * @param s
     * @return
     */
    public static String Md5(String s){
        String base = s +"/"+C_Tool.slat;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

    /**
     * 确认email格式
     * @param mail
     * @return
     */
    public static boolean CheckMailFormat(String mail){
        if(mail.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * 确认手机号格式
     * @param mobile
     * @return
     */
    public static boolean CheckMobileFormat(String mobile){
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";
        if (Pattern.matches(regex, mobile)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 生成不重复的UUID
     * @param
     * @return
     */
    public static String GetUUID(){

        return  java.util.UUID.randomUUID().toString();
    }

    /**
     * 随机生成字符串
     * length用户要求产生字符串的长度
     * @param length
     * @return
     */
    public static String GetRandomString(int length){
        if(length<=0){
            return "";
        }
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 随机生成数字串
     * length用户要求产生数字串的长度
     * @param length
     * @return
     */
    public static String GetRandomNumber(int length){
        if(length<=0){
            return "";
        }
        String str="0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(10);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }


    /**
     * 分页条件查询
     * @param page
     * @param number
     * @param example
     * @return
     */
    public static  <O> C_Result<O> GetList(Integer page, Integer number, C_IfDao<O, C_IfExample> dao, C_IfExample example){

        if(number<=0){
            return new C_Result<>();
        }

        page = (page<2?0:page);

        example.setOffset((long)(page*number));
        example.setLimit(number);

        List<O> list= dao.selectByExample(example);

        C_Result result = new C_Result<ClClue>();
        result.list = list;
        result.count = dao.countByExample(example);
        result.pageCount = (long)Math.ceil((double)result.count/number);

        return result;

    }


}
