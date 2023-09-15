package functionalInterfaces.moreFunctionalInterface;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {
    public static void main(String[] args) {
        DoubleFunction<Integer> doubleFunction = number->(int)(number * 5.0);
        int result =doubleFunction.apply(4.0);
        System.out.println("the result of the number entered multiplied by 5.0 is::" + " "+result);

        DoubleFunction<Integer> doubleFunction1 = number->(int) (number * number);
        int resultSquare = doubleFunction1.apply(8);
        System.out.println("the Square of your input is::"+" "+resultSquare);
    }

}
