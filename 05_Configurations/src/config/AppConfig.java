package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @Created By Ravindu Prathibha
 * @created 5/8/2024 - 10:53 AM
 * @project Spring_Framework
 */
@Configuration
@ComponentScan(basePackages = "bean")
@Import({AppConfig2.class,AppConfig3.class})
@ImportResource("classpath:abcd.xml") //Direct Path
@ImportResource("file:absolute-path-of-abcd.xml") //Absolute Path
public class AppConfig {
    public AppConfig() {
        System.out.println("Create Config Object");
    }
}
