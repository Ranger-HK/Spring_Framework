package bean;

import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 11:31 AM
 * @project Spring_Framework
 */

@Component
public class Boy {
    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chattingWithGirl(){
        Girl girl = new Girl();
        girl.chat();
    }
}
