package di;

import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 1:09 PM
 * @project Spring_Framework
 */

@Component
public class C1 {
    public C1() {
        System.out.println("ClassOne Instantiated");
    }

    public void chat() {
        System.out.println("Chatting With Class One");

    }
}
