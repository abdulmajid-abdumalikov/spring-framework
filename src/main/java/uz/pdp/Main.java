package uz.pdp;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Arrays;

public class Main {
    static ExpressionParser parser = new SpelExpressionParser();

    public static void main(String[] args) {

        String value = ep("('hello').toUpperCase").getValue(String.class);
        int[] value1 = ep("{1, 2, 3, 4, 5}").getValue(int[].class);

        System.out.println(value);
        System.out.println(Arrays.toString(value1));
        System.out.println(value1[3]);
        System.out.println(ep("'Hello PDP'.length").getValue(Integer.class));
        System.out.println(ep("'Hello PDP'.length()").getValue(Integer.class));
        System.out.println(ep("'Hello PDP'.substring(3, 9)").getValue(String.class));
        System.out.println(ep("'Hello PDP'.toLowerCase").getValue(String.class));
        System.out.println(ep("'Hello PDP\t'.repeat(10)").getValue(String.class));

        Club club = new Club();
        EvaluationContext context = new StandardEvaluationContext(club);
        System.out.println(ep("isMember('John')").getValue(context, boolean.class));
        System.out.println(ep("isMember('Johny')").getValue(context, boolean.class));

        System.out.println(ep("new uz.pdp.Emp('John', 21)").getValue(Emp.class));

        System.out.println(ep("5 == 5").getValue());
        System.out.println(ep("5 != 5").getValue());
    }

    private static Expression ep(String expression) {
        return parser.parseExpression(expression);
    }
}