package bean;

import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 11:31 AM
 * @project Spring_Framework
 */
@Component
public class Girl {
    public Girl() {
        System.out.println("Girl Instantiated");
    }

    public void chat(){
        System.out.println("Chatting");
    }
}
