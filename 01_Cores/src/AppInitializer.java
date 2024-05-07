import bean.*;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Created By Ravindu Prathibha
 * @created 5/3/2024 - 4:29 PM
 * @project Spring_Framework
 */
public class AppInitializer {
    public static void main(String[] args) {

        // Create Container Object
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

      /* //Run Something Just Before JVM Shutdown --> Hard Way
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                ctx.close();
            }
        }));*/

       //Run Something Just Before JVM Shutdown --> Easy Way
        ctx.registerShutdownHook();


        //Register Config class
        ctx.register(AppConfig.class);

        ctx.refresh();

        //request for bean
        SpringBean bean = ctx.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

       /* BeanTwo beantwo = ctx.getBean(BeanTwo.class);
        System.out.println(beantwo);*/

        BeanThree beanthree = ctx.getBean(BeanThree.class);
        System.out.println(beanthree);

        BeanFour beanFour = ctx.getBean(BeanFour.class);
        System.out.println(beanFour);


        BeanFive beanFive = ctx.getBean(BeanFive.class);
        System.out.println(beanFive);


        Object beanTwo = ctx.getBean("beanTwo");
        System.out.println(beanTwo);

       /* BeanTwo beanTwo = (BeanTwo) ctx.getBean("beanTwo");//bean ID
        System.out.println(beanTwo);*/


    }
}
















