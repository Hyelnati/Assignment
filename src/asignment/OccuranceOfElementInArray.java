package asignment;

public class OccuranceOfElementInArray {
    public static void main(String[] args) {
        int [] array = {3,0,7,8,9,3,7};
        //elementTwo(array);

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.printf("%10d", i * j);

                //System.out.print(i * j + " ");
            }
            System.out.println();
            //System.out.println();
        }

    }

    public String elementCheck(int[] array, int numberToCheck) {
        for (int index = 0; index < array.length; index++) {
            if(array[index] == numberToCheck){
                return "Number exists";
            }
        }
        return "Number does not exist";
    }
    public static void elementTwo(int[] numbers){
                    //{3,0,7,8,9,3,7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i at " + i +" = "+numbers[i]);
            for (int j = i+1; j < numbers.length; j++) {
                System.out.println("j at " + i +" = "+numbers[j]);
            }
            System.out.println();
        }
    }
}
