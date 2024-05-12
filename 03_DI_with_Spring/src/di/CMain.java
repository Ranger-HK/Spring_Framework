package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 1:10 PM
 * @project Spring_Framework
 */

@Component
public class CMain implements GoodClass {

 /*   // property injection
    @Autowired
    GoodClass classOne;*/

    //Constructor Injection

    GoodClass classOne;

    @Autowired
    public CMain(GoodClass g) {
        this.classOne=g;
        System.out.println("Class is in context");
    }



    @Override
    public void chattingWithCs() {
        classOne.chattingWithCs();
    }
}
