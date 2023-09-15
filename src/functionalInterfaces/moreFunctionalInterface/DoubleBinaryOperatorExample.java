package functionalInterfaces.moreFunctionalInterface;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator1 = Double::sum;
        System.out.println(doubleBinaryOperator1.applyAsDouble(5.0, 8.0));

        DoubleBinaryOperator doubleBinaryOperator2 = (number1, number2)->number1-number2;
        System.out.println(doubleBinaryOperator2.applyAsDouble(3.0, 9.0));

        DoubleBinaryOperator doubleBinaryOperator3 = (number1, number2)->number1/number2;
        System.out.println(doubleBinaryOperator3.applyAsDouble(4, 2));

        DoubleBinaryOperator doubleBinaryOperator4 = (number1, number2)->number1 % number2;
        System.out.println(doubleBinaryOperator4.applyAsDouble(4, 2));
    }
}
