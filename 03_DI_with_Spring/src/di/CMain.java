package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/12/2024 - 1:10 PM
 * @project Spring_Framework
 */

@Component
public class CMain implements IntInject {

    /*// property injection
    @Autowired
    GoodClass classOne;*/



   /* //Constructor Injection
    GoodClass classOne;

    @Autowired
    public CMain(GoodClass g) {
        this.classOne=g;
        System.out.println("Class is in context");
    }
*/



    /*//Setter Method Injection
    GoodClass classOne;

    @Autowired
    public void setClassOne(GoodClass classOne) {
        this.classOne = classOne;
    }*/


    //Interface Through Injection
    GoodClass classOne;

    @Autowired
    @Override
    public void inject(GoodClass classOne) {
        this.classOne = classOne;
    }


    public void chattingWithCs() {
        classOne.chattingWithCs();
    }
}
