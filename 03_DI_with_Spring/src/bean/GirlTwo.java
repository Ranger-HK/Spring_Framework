package bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 12:40 PM
 * @project Spring_Framework
 */
@Component
@Primary
public class GirlTwo implements GoodGirl {

    @Override
    public void chat() {
        System.out.println("Chatting With Girl Two");

    }
}
