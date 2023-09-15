package functionalInterfaces;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<Integer, String> function = (number)-> "function takes in two arguments" +" " +number;
        System.out.println(function.apply(1234567));
    }
}
