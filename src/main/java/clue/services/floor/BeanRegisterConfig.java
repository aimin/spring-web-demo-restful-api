package clue.services.floor;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 过滤器配置
 */
@Configuration
public class BeanRegisterConfig {

    @Bean
    public FilterRegistrationBean createFilterBean() {
        //过滤器注册类
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new JwtFilter());

        //测试的token
        //eyJhbGciOiJIUzI1NiJ9.eyJ1aWQiOjEsImV4cCI6MTU3MTMwMzc0MCwiaWF0IjoxNTcxMzAxMTQ4LCJqdGkiOiJ0b2tlbklkIiwidXNlcm5hbWUiOiJzYW0ifQ.VMBL0hOMfakidioNK-U6PQQAwHz1opDLgKTUx9PCa7w

        registration.addUrlPatterns("/user/*");//需要过滤的接口
        return registration;
    }
}



