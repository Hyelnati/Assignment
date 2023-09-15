package functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String,Boolean,Integer> biFunction = (word, condition) ->{
            if(word.equals(String.valueOf(condition))){
                return 1;
            }
            return 0 ;

        };
        System.out.println(biFunction.apply("true", true));
    }
}
