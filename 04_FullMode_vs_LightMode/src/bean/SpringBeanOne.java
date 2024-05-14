package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/8/2024 - 10:54 AM
 * @project Spring_Framework
 */
@Component
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBeanOne() {
        System.out.println("Spring Bean One Instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean One Bean Name Aware Call");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean One Bean Factory Name Aware Call");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean One Application Context Aware Call");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean One Initializing Bean Called And Bean Is Ready To Use");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean One Destroyed");

    }

     //Light Mode
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

    @Bean
    public MyConnection myConnection() {
        return new MyConnection();

    }

}
