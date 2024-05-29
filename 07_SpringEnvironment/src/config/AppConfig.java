package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Created By Ravindu Prathibha
 * @created 5/8/2024 - 10:53 AM
 * @project Spring_Framework
 */
@Configuration
@ComponentScan(basePackages = "bean")
@PropertySource("classpath:application.properties")
public class AppConfig {
    public AppConfig() {
        System.out.println("Create Config Object");
    }
}
