package uz.pdp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("ioc-config.xml");
        Transform transform = (Transform) context.getBean("transform");
        transform.start();*/

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Transform transform = context.getBean(Transform.class);
        transform.start();
    }
}