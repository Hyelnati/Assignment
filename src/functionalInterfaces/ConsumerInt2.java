package functionalInterfaces;

import java.util.Map;
import java.util.function.Consumer;

public class ConsumerInt2 {
    //consumer that takes in two arguments
    public static void main(String[] args) {
        Map<String, Integer> map= Map.of(
                "ABC", 10,
                "DEF", 20,
                "GHI", 30,
                "JKL", 40,
                "MNO", 50);
        Consumer<Integer> consumer = (x)-> System.out.println(x);
        map.forEach((key, value)-> consume(key,value));
    }
    public static void consume(String key, Integer value){

    }
}
