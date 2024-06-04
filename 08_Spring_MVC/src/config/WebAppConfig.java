package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Created By Ravindu Prathibha
 * @created 6/3/2024 - 1:27 PM
 * @project Spring_Framework
 */
@Configuration
//@ComponentScan(basePackages = {"bean","controller"})
@ComponentScan(basePackages = "controller")
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

    //create viewResolver
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/views/"); //views location
        internalResourceViewResolver.setSuffix(".html"); //what are the views folder files extensions type
        internalResourceViewResolver.setOrder(2);
        return internalResourceViewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/views/**").addResourceLocations("views/");
    }
}
