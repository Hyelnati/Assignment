package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = (x)-> x.equals("b");
        System.out.println(predicate.test("A"));
        System.out.println(predicate.test("a"));
        System.out.println(predicate.test("b"));

        //check the length of the string
        Predicate<String> predicate1 = (x)->x.contains("1234");
        System.out.println(predicate1.test("emisco"));
    }
}
