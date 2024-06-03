package uz.pdp;

import java.util.Random;

public class Performance {
    public void perform() {
//        System.out.println("Performing ................");

        if (new Random().nextBoolean()) {
            System.out.println("Performing ................");
        } else {
            throw new RuntimeException();
        }
    }
}
