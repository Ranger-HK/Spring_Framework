package config;

import bean.MyBasicDataSource;
import bean.MyConnection;
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

    //Full Mode
    @Bean
    public MyBasicDataSource myBasicDataSource() {

        //Inter Bean Dependency Invocation
        MyConnection myConnection = myConnection();
        MyConnection myConnection2 = myConnection();
        MyConnection myConnection3 = myConnection();

        System.out.println(myConnection);
        System.out.println(myConnection2);
        System.out.println(myConnection3);

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection);

        return myBasicDataSource;

    }

    public MyConnection myConnection() {
        return new MyConnection();

    }

}
