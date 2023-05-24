package asignment;

import java.util.ArrayList;
import java.util.List;

public class LargestElementInAnArray {
    public int returnLargest(int[] array) {
       //{1,3,4,1,2,9,6,8}
        int largest = array[0];
        for (int index = 0; index< array.length; index++){
            if(array[index] > largest) largest = array[index];
        }
        return largest;
    }

    public int returnLargestList(int[] array) {
        int[] givenArray = {1,3,4,1,2,9,6,8};
        int[] secondArray = new int[givenArray.length];
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < givenArray.length; i++) {
            //secondArray[i] = givenArray[i];
            numbers.add(givenArray[i]);
        }
        int largest = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > largest) largest = numbers.get(i);
        }
        return largest;
    }
}
