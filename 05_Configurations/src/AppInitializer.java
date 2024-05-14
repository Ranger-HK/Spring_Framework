import config.AppConfig;
import config.AppConfig2;
import config.AppConfig3;
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
        ctx.register(AppConfig2.class);
        ctx.register(AppConfig3.class);


        ctx.refresh();
        ctx.registerShutdownHook();

    }

}















