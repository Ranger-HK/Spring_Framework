package bean;

import org.springframework.beans.factory.DisposableBean;

public class MyConnection implements DisposableBean{
    public MyConnection() {
        System.out.println("My Connec tion");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My Connection Destroyed...");
    }
}
