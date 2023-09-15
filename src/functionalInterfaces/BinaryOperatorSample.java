package functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (number1, number2)-> number1 * number2;
        System.out.println(binaryOperator.apply(3,2));
    }
}
