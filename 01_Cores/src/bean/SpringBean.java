package bean;

import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/3/2024 - 4:29 PM
 * @project Spring_Framework
 */

//POJO Driven Approach Spring Beans

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring Bean Object Created");
    }

    public void testBean(){
        System.out.println("Yes.. Spring Bean is working...!");
    }
}
