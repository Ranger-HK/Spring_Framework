package bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/3/2024 - 5:36 PM
 * @project Spring_Framework
 */
@Component
//@Scope("prototype") //change singleton to object - 1st way
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //- 2nd way

public class BeanTwo {
    public BeanTwo() {
        System.out.println("Bean Two");
    }
}
