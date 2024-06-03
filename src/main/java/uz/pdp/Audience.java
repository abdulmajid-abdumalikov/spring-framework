package uz.pdp;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Before("execution(* uz.pdp.Performance.perform(..))")
    public void silencingPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("execution(* uz.pdp.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking Seats");
    }

    @AfterReturning("execution(* uz.pdp.Performance.perform(..))")
    public void applause() {
        System.out.println("👏👏👏");
    }

    @AfterThrowing("execution(* uz.pdp.Performance.perform(..))")
    public void refund(){
        System.out.println("🤬🤬🤬");
    }
}
