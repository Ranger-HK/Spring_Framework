package bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 11:31 AM
 * @project Spring_Framework
 */
@Component
//@Primary
public class GirlOne implements GoodGirl {
    public GirlOne() {
        System.out.println("Girl Instantiated");
    }


    @Override
    public void chat() {
        System.out.println("Chatting With Girl One");

    }
}
