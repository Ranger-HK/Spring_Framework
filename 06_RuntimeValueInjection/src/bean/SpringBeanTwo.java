package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Created By Ravindu Prathibha
 * @created 5/14/2024 - 11:18 PM
 * @project Spring_Framework
 */
public class SpringBeanTwo implements InitializingBean {

    @Value("C001")
    private String id;

    @Value("Ravindu")
    private String name;

    @Value("Bandaragama")
    private String address;

    @Value("100.00")
    private double salary;

    public SpringBeanTwo(){
        System.out.println("Spring Bean Two Instantiated");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }
}
