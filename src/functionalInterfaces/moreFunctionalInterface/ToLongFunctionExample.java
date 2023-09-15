package functionalInterfaces.moreFunctionalInterface;

import java.util.function.ToLongFunction;

public class ToLongFunctionExample {
    public static void main(String[] args) {
        ToLongFunction<Integer> toLongFunction = (x)-> x * 10;
        long toLongResult = toLongFunction.applyAsLong(6);
        System.out.println("ToLongFunction result is:: "+ toLongResult);

        ToLongFunction<String> toLongFunction1 = (x)-> Long.parseLong(x) *10;
        long toLongResult1 = toLongFunction1.applyAsLong("6");
        System.out.println("ToLongFunction result is:: "+ toLongResult1);
    }
}
