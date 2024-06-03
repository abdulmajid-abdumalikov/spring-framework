package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("uz.pdp");
        System.out.println(context.getBean(ArithmeticOperators.class).add);
        System.out.println(context.getBean(ArithmeticOperators.class).pow);
        System.out.println(context.getBean(ArithmeticOperators.class).mod);
        System.out.println(context.getBean(ArithmeticOperators.class).gt);
        System.out.println(context.getBean(ArithmeticOperators.class).ternary);
    }
}
