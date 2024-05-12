package di;

import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 1:09 PM
 * @project Spring_Framework
 */

@Component
public class ClassOne {
    public ClassOne() {
        System.out.println("ClassOne Instantiated");
    }

    public void chat() {
        System.out.println("Chatting With Class One");

    }
}
