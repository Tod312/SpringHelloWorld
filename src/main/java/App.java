import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        Cat catBean = applicationContext.getBean("cat", Cat.class);
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean.getMessage());
        
        System.out.println("Is this the same HelloWorldbean? -" + (bean == bean2));
        System.out.println("Is this the same cat? -" + (catBean == catBean2));
        
        
    }
}