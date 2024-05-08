import bean.MyConnection;
import bean.SpringBeanOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Created By Ravindu Prathibha
 * @created 5/3/2024 - 4:29 PM
 * @project Spring_Framework
 */
public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.registerShutdownHook();

        ctx.register(AppConfig.class);

        ctx.refresh();

       /* SpringBeanOne bean1 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean1);

        SpringBeanOne bean2 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean2);

        SpringBeanOne bean3 = ctx.getBean(SpringBeanOne.class);
        System.out.println(bean3);*/


        MyConnection bean1 = ctx.getBean(MyConnection.class);
        MyConnection bean2 = ctx.getBean(MyConnection.class);
        System.out.println(bean1);
        System.out.println(bean2);
    }

}
















