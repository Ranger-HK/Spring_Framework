import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

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


        //Access System Environment Variables in Java
        //System.getenv()  -- use that key
        Map<String, String> getenv = System.getenv();
        for (String key:getenv.keySet()) {
            System.out.println(key+" : "+getenv.get(key));
        }


        //Access Java Properties Variables in Java
        //System.getProperties(); -- use that key
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            System.out.println(key+" : "+properties.get(key));
        }

    }

}















