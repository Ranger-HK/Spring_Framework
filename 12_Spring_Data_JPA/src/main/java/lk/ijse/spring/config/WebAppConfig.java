package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 5:41 PM
 * @project Spring_Framework
 */
@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("Work");
    }
}
