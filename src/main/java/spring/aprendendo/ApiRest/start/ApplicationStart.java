package spring.aprendendo.ApiRest.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "spring.aprendendo.ApiRest.endpoint")
public class ApplicationStart {

    public static void main(String[] args) {
        
        SpringApplication.run(ApplicationStart.class, args);

    }

}
