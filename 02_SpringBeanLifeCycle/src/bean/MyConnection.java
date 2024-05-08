package bean;

import org.springframework.beans.factory.DisposableBean;

public class MyConnection {
    public MyConnection() {
        System.out.println("My Connection");
    }

 /*   @Override
    public void destroy() throws Exception {
        System.out.println("My Connection Destroyed...");
    }*/
}
