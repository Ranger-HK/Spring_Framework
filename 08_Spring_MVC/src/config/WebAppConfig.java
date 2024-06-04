package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Created By Ravindu Prathibha
 * @created 6/3/2024 - 1:27 PM
 * @project Spring_Framework
 */
@Configuration
//@ComponentScan(basePackages = {"bean","controller"})
@ComponentScan(basePackages = "controller")
@EnableWebMvc
public class WebAppConfig {
}
