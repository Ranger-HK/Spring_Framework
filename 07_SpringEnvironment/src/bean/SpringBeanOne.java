package bean;

import org.springframework.beans.factory.InitializingBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Created By Ravindu Prathibha
 * @created 5/8/2024 - 10:54 AM
 * @project Spring_Framework
 */
@Component
public class SpringBeanOne implements InitializingBean {

    @Value("${ijse.application.name}")
    private String appCom;


    //${} -> Property Placeholder  - Spring Environment
    @Value("${user.name}")
    private String osName;

    @Value("${LOGNAME}")
    private String log;


    public SpringBeanOne() {
        System.out.println("Bean One");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(log);
        System.out.println(appCom);
    }
}
