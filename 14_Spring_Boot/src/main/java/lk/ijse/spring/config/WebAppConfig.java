package lk.ijse.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 5:41 PM
 * @project Spring_Framework
 */
@Configuration
public class WebAppConfig {

    public WebAppConfig() {
        System.out.println("Work");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
