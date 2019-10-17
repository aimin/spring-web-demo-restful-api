package clue.services.floor;

import clue.util.C_JSON_Result;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.jsonwebtoken.Claims;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class JwtFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request =(HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        String token = request.getHeader("authorization"); //获取请求传来的token
        Claims claims = JwtHelper.verifyJwt(token); //验证token

        if (claims == null) {
            C_JSON_Result r = new C_JSON_Result();
            //token无效
            r.SetReturnCode(10003);
            String json= JSONObject.toJSONString(r);
            Writer w = response.getWriter();
            w.write(json);
        }else {

            //token 有效
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
