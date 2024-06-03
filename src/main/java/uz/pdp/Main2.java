package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("uz.pdp");
        System.out.println(context.getBean(ArithmeticOperators.class).add);
    }
}
