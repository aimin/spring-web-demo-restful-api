package keywords;

import clue.services.Clue;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("clue.dao")
@ComponentScan("clue.services")
public class SamApplication {


    public static void main(String[] args) {
        SpringApplication.run(SamApplication.class, args);

    }

}
