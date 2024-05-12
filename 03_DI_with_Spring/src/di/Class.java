package di;

import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 1:10 PM
 * @project Spring_Framework
 */

@Component
public class Class {
    public Class() {
        System.out.println("Class is in context");
    }

    public void chattingWithClasses(){
        System.out.println("Chatting");
    }
}
