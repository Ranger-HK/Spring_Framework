package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 5:58 PM
 * @project Spring_Framework
 */
@Configuration
public class JPAConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource ds, JpaVendorAdapter va){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setJpaVendorAdapter(va); //Vendor (Hibernate)
        bean.setDataSource(ds); //Connection
        bean.setPackagesToScan("lk.ijse.spring.entity"); //Location of the entity
        return bean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/springjpa?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("19990202Ravi@:&pra");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }


}
