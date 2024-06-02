package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MyConfig.class).getBean(MyBean2.class).sayHello();
    }
}