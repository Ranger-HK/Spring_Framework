package di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 1:09 PM
 * @project Spring_Framework
 */

@Component
@Primary
public class C1 implements GoodClass{
    public C1() {
        System.out.println("ClassOne Instantiated");
    }

    @Override
    public void chattingWithCs() {
        System.out.println("Chatting With Class One");
    }
}
