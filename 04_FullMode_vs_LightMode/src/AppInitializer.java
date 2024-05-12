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
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


        SpringBeanOne sb1 = ctx.getBean(SpringBeanOne.class);
        System.out.println(sb1);

    }

}
















