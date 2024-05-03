import bean.SpringBean;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Created By Ravindu Prathibha
 * @created 5/3/2024 - 4:29 PM
 * @project Spring_Framework
 */
public class AppInitializer {
    public static void main(String[] args){

        // Create Container Object
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

       //Register Config class
        ctx.register(AppConfig.class);

        ctx.refresh();

        SpringBean bean = ctx.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

        ctx.close();
    }
}
















