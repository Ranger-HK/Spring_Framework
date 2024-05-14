package config;

import bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Created By Ravindu Prathibha
 * @created 5/14/2024 - 7:16 PM
 * @project Spring_Framework
 */
@Configuration
public class AppConfig3 {

    @Bean
    public B b() {
        return new B();
    }
}
