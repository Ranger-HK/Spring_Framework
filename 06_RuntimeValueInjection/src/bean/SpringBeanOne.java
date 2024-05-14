package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/8/2024 - 10:54 AM
 * @project Spring_Framework
 */
@Component
public class SpringBeanOne {
   /* public SpringBeanOne(@Value("C001") String id ) {
        System.out.println("Spring Bean One Instantiated");
        System.out.println(id);
    }*/

    @Autowired(required = false) // Greediest Constructor
    public SpringBeanOne(@Value("C001") String id , @Value("10") int age,@Value("true") boolean b) {
        System.out.println("Spring Bean One Instantiated");
        System.out.println(id);
        System.out.println(age);
        System.out.println(b);
    }

    @Autowired(required = false)
    public SpringBeanOne(@Value("1,2,3") int[] myNames,@Value("A") char a,@Value("1,,3") int[] n,@Value("3,7") int[] n2) {
        System.out.println("Spring Bean One Instantiated");
        for (Integer myName : myNames){
            System.out.println(myName);
        }
        System.out.println(a);
    }

}
