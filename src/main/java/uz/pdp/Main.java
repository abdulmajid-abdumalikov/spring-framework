package uz.pdp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("ioc-config.xml");
        Performance performance = container.getBean(Performance.class);
        performance.perform();
    }
}