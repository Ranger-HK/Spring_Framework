package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Created By Ravindu Prathibha
 * @created 5/3/2024 - 4:29 PM
 * @project Spring_Framework
 */
@Configuration // Me Class eka Configuration Class Ekak Kiyala Kiyanna annotation eka
@ComponentScan(basePackages = "bean")  //Scanning and Introduce Spring Bean/POJO Class to Application Context
public class AppConfig {
    public AppConfig() {
        System.out.println("Create Config Object");
    }

    /*@Bean("connection")
    //@Bean
    public MyConnection getConnection(){
        return new MyConnection();
    }*/

}
