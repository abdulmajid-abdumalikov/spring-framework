package uz.pdp;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TransformAspect {

    @Before("execution(* uz.pdp.Transform.start(..))")
    public void beforeStart() {
        System.out.println("Before start() method.");
    }

    @After("execution(* uz.pdp.Transform.start(..))")
    public void afterStart() {
        System.out.println("After start() method.");
    }

    @AfterReturning("execution(* uz.pdp.Transform.start(..))")
    public void afterReturningStart() {
        System.out.println("After returning from start() method.");
    }

    @AfterThrowing("execution(* uz.pdp.Transform.start(..))")
    public void afterThrowingStart() {
        System.out.println("Exception in start() method.");
    }
}
