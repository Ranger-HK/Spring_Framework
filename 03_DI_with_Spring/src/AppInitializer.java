import bean.Boy;
import config.AppConfig;
import di.CMain;
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

        /*Boy boy = ctx.getBean(Boy.class);
        System.out.println(boy);
        boy.chattingWithGirl();*/

        CMain bean = ctx.getBean(CMain.class);
        bean.chattingWithCs();


    }

}
















