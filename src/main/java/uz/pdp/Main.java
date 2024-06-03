package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        Performance performance = container.getBean(Performance.class);
        performance.perform();
    }
}