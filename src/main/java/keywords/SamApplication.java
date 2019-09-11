package keywords;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("keywords.dao")
public class SamApplication {


    public static void main(String[] args) {
        SpringApplication.run(SamApplication.class, args);
    }

}
