package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 11:31 AM
 * @project Spring_Framework
 */

@Component
public class Boy {

    @Autowired
    GoodGirl girl; //property injection

    public Boy() {
        System.out.println("Boy Instantiated");
    }

    public void chattingWithGirl(){
        girl.chat();
    }
}
