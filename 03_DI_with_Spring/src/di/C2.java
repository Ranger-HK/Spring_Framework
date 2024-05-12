package di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 1:09 PM
 * @project Spring_Framework
 */

@Component
public class C2 implements GoodClass {
    public C2() {
        System.out.println("Class Two Instantiated");
    }

    @Override
    public void chattingWithCs() {
        System.out.println("Chatting With Class Two");

    }
}
