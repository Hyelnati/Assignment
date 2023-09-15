package studentGrade;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPerformance {
    public static void main(String[] args) {
        questions();
    }

  static Scanner input = new Scanner(System.in);

  public static void questions(){
      System.out.println("Enter number of students: ");
      int numberOfStudents = input.nextInt();
      System.out.println("Enter number of subjects: ");
      int numberOfSubjects = input.nextInt();

      int[][] array = new int[numberOfStudents][numberOfSubjects];


      for (int Students =0; Students < array.length; Students++){
          System.out.println("Student ID: "+ Students );
          for (int Subject =0; Subject < array[Students].length; Subject++){
              System.out.println("Enter Subjects Score: "+ Subject );
              array[Students][Subject] = input.nextInt();
          }
      }
      for (int Subject =0; Subject < array.length; Subject++){
          System.out.printf("       Sub%d", Subject);
      }
      System.out.println(" ");
      for (int Students =0; Students < array.length; Students++){
              System.out.println("Student " + Students+ " ");
          }



  }
}
