package functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (word)-> word;
        System.out.println(unaryOperator.apply("Mega"));

        //reverse
        UnaryOperator<String> unaryOperator1 = (word)-> new StringBuilder(word).reverse().toString();
        System.out.println(unaryOperator1.apply("Mega"));
    }
}
