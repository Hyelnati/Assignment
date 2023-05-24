import java.util.Arrays;

 public class Array {
        public static void main(String[] args) {
            int[] array = {1,2,3,4,};
            //System.out.println(checkForOddNumbers(array));
            evenNumbers(array);
            System.out.println();
            checkForOddNumbers(array);
            System.out.println();
            running_total(array);
            System.out.println();
            returnLargest(array);
            System.out.println();
            stringPalindrome();
            System.out.println();
            sumOfNumbersUsingForLoop(array);
            System.out.println();
            sumOfNumbersUsingWhileLoop(array);
            System.out.println();
            sumOfNumbersUsingDoWhileLoop(array);
            System.out.println();


        }
        public static void checkForOddNumbers(int[] array) {
            //int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,17,15};
            int oddNumber = 0;
            for (int index = 0; index < array.length; index++) {
                if (array[index] % 2 != 0) {
                    oddNumber = array[index];
                    System.out.print(oddNumber + " ");

                }
            }
        }
        public static void evenNumbers(int [] array){
            //int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,17,15};
            int evenNumbers = 0;
            for (int index = 0; index < array.length; index++) {
                if (array[index] % 2 ==0){
                    evenNumbers = array[index];
                    System.out.print(evenNumbers + " ");
                }

            }

        }
        public static void running_total(int[] array){
            //int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,17,15};
            int total = 0;
            for (int index = 0; index < array.length ; index++) {
                total += array[index];
            }
            System.out.println("Total of array is: " + total);

        }
        public static void returnLargest(int[] array) {
            //{1,3,4,1,2,9,6,8}
            int largest = array[0];
            for (int index = 0; index< array.length; index++){
                if(array[index] > largest) largest = array[index];
                System.out.println("Largest Element is: " + largest);
            }
        }


        public static void stringPalindrome () {
            String word = "Madam";
            String wordLower = word.toLowerCase();

            boolean thisIsPalindrome = isStringPalindrome(wordLower);

            System.out.println("Input string: " + wordLower);
            System.out.println("Is palindrome: " + thisIsPalindrome);
        }
        public static boolean isStringPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
        public static void sumOfNumbersUsingForLoop(int[] array){
            //int [] number = {1,2,3,4}
            int sum = 0;
            for (int index = 0; index < array.length; index++) {
                sum += array[index];

            }
            System.out.print("sum for ForLoop is: " + sum);
        }
        public static void sumOfNumbersUsingWhileLoop(int[] array){
            int sum = 0;
            int index = 0;
            while (index < array.length){
                sum+= array[index];
                index++;
            }
            System.out.println("sum for while loop is: " + sum);
        }

        public static void sumOfNumbersUsingDoWhileLoop(int[] array){
            int index = 0;
            int sum = 0;
            do {sum += array[index];
                index++;

                System.out.print(sum);
            }while (index < array.length);

        }
        public static char[] concatenateTwoList(char[] array, char[]arr){
            char [] array1 = {'a','b','c'};
            char [] array2 = {'1','2','3'};
            char [] newArray= concatenateTwoList(array1, array2);

            System.out.println("First Array: " + Arrays.toString(array1));
            System.out.println("Second Array: " + Arrays.toString(array2));
            System.out.println("Combination is: "+ Arrays.toString(newArray));


            return newArray;
        }

    }