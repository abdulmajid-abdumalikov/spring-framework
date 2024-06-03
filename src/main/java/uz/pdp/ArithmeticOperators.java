package uz.pdp;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class ArithmeticOperators {

    @Value("#{1+2}")
    public int add;

    @Value("#{12 ^ 2}")
    public int pow;


    @Value("#{12 mod 5}")
    public int mod;

    @Value("#{12 gt 5}")
    public boolean gt;

    @Value("#{12 < 5 ?'tvelve':'five'}")
    public String ternary;
}
