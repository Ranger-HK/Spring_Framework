package lk.ijse.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @Created By Ravindu Prathibha
 * @created 6/10/2024 - 5:58 PM
 * @project Spring_Framework
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "lk.ijse.spring.repo")
@PropertySource("classpath:application.properties") //introduce resources bundel to spring context
public class JPAConfig {

    @Autowired
    Environment env;

    //Create BeanFactory
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter va){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setJpaVendorAdapter(va); //Vendor (Hibernate)
        bean.setDataSource(ds); //Connection
        bean.setPackagesToScan(env.getRequiredProperty("entity.package.name")); //Location of the entity
        return bean;
    }

    //Introduce Connection
    @Bean
    public DataSource dataSource() throws NamingException {

        //Driver Manager Data Source

       /* DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(env.getRequiredProperty("my.app.url"));
        dataSource.setUsername(env.getRequiredProperty("my.app.username"));
        dataSource.setPassword(env.getRequiredProperty("my.app.password"));
        dataSource.setDriverClassName(env.getRequiredProperty("my.app.driverclassname"));
        return dataSource;*/

        //JNDI Data Source
        return (DataSource) new JndiTemplate().lookup("java:comp/env/jdbc/pool");
    }

    //Introduce Vendor (Hibernate)
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setDatabasePlatform(env.getRequiredProperty("my.app.dialect"));
        hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
        hibernateJpaVendorAdapter.setShowSql(true);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        return hibernateJpaVendorAdapter;

    }

    //Introduce Transaction Manager
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        return new JpaTransactionManager(entityManagerFactory);
    }


}
