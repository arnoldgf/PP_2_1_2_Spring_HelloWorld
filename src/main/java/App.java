import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("Сat");
        Cat cat2 = (Cat) applicationContext.getBean("Сat");

        System.out.println("Бины HelloWorld одинаковые " + (bean == applicationContext.getBean("helloworld")));
        System.out.println("Бины Cat " + (cat1 == cat2));
    }
}