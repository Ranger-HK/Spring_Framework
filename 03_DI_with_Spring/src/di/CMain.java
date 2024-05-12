package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 1:10 PM
 * @project Spring_Framework
 */

@Component
public class CMain implements GoodClass {

    @Qualifier("c1")
    @Autowired
    GoodClass classOne;

    public CMain() {
        System.out.println("Class is in context");
    }

    @Override
    public void chattingWithCs(){
        classOne.chattingWithCs();
    }
}
