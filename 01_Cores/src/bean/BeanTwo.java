package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/3/2024 - 5:36 PM
 * @project Spring_Framework
 */
@Component
@Scope("prototype") //change singleton to object
public class BeanTwo {
    public BeanTwo() {
        System.out.println("Bean Two");
    }
}
