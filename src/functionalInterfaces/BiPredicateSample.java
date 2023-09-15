package functionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (sentence,number)-> sentence.equals(number);
        System.out.println(biPredicate.test("many", 0));
    }
}
