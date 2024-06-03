package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 6/3/2024 - 1:27 PM
 * @project Spring_Framework
 */
@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBean() {
        System.out.println("Spring Bean One");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean One Factory ");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean One Awareness");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean One Destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean One Initializing");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean One Application Context Aware Call");

    }
}
