package bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/8/2024 - 10:54 AM
 * @project Spring_Framework
 */
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("Spring Bean One Object Created");
    }
}
