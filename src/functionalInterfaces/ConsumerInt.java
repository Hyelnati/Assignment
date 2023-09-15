package functionalInterfaces;

import java.util.Set;

public class ConsumerInt {
    public static void main(String[] args) {
//        Set<Integer> set = Set.of(10,20,30,40,50);
  //      Consumer<Integer> consumer = (x)-> System.out.println(x);
//
  //      set.forEach(consumer); //takes every element in the set and applies what the consumer instructs OR

        Set<Integer> set = Set.of(10,20,30,40,50);
        set.forEach((x) -> System.out.println(x)); // OR
        //set.forEach(System.out::println);
        set.forEach(ConsumerInt::consume); //use name of the class to call the method
        set.forEach((x)-> consume(x)); //use the name of the method to call the reference
    }

    private static  void consume(Integer number){

    }
}
