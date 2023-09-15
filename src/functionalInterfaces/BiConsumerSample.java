package functionalInterfaces;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "QWERTY", 5,
                "ASDFG" ,10
        );
        BiConsumer<String, Integer> biConsumer = (firstArgument, secondArgument) ->
                System.out.println(firstArgument +" "+ secondArgument);
        biConsumer.accept("Able", 21);
        map.forEach(biConsumer);

        //OR

        map.forEach((firstArgument, secondArgument) ->
                System.out.println(firstArgument +" "+ secondArgument));
    }
}
