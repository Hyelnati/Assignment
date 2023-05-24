package asignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversalOfAnArray {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("j");
            }
            System.out.println("i");
        }
        int[] array = {1,0,4,6,7,2,9,6,8};

//        for (int i = array.length - 1; i >= 0 ; i--) {
//            System.out.println(array[i]);
//        }

        //System.out.println(reversedArray(array));
        reversedArray1(array);

    }

    public static List<Integer> reversedArray(int[] array) {
        //int[] myArray = {1,0,4,6,7,2,9,6,8};
        int [] empty = new  int[array.length];
        List<Integer> tempStore = new ArrayList<>();
        for (int index = array.length-1; index >=0; index--) {
            tempStore.add(array[index]);
        }
    return tempStore;
    }

    public static void reversedArray1(int[] array) {
        //int[] myArray = {1,0,4,6,7,2,9,6,8};
        int [] empty = new  int[array.length];

        for (int index = array.length-1; index >=0; index--) {
            empty[index] = array[index];
            System.out.println(Arrays.toString(empty));
        }
    }
}
