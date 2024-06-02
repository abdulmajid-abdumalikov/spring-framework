package uz.pdp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        MyBean2 myBean2 = new ClassPathXmlApplicationContext("beans.xml").getBean(MyBean2.class);
        myBean2.sayHello();
    }
}