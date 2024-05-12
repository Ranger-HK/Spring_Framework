package config;

import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Created By Ravindu Prathibha
 * @created 5/8/2024 - 10:53 AM
 * @project Spring_Framework
 */
@Configuration
@ComponentScan(basePackages = "bean")

public class AppConfig {

    @Bean
    public SpringBeanOne getBeanOne(){
        SpringBeanOne beanOne = getBeanOne();

        System.out.println(beanOne);

        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getBeanTwo(){
        return new SpringBeanTwo();
    }

}
