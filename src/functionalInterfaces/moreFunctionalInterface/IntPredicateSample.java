package functionalInterfaces.moreFunctionalInterface;

import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        IntPredicate intPredicate = (int x)-> false;
        System.out.println(intPredicate.test(10));

        IntPredicate intPredicate1 = (x)-> true;
        System.out.println(intPredicate1.test(20));
    }
}
