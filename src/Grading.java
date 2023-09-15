import java.util.Scanner;

public class Grading {
    Scanner input = new Scanner(System.in);
    public void displayGrade() {
        System.out.println("How many Students do You have: ");
        int numberOfStudents = input.nextInt();

        System.out.println("How many Subjects are offered: ");
        int numberOfSubject = input.nextInt();
        int[][] theGrades = new int[numberOfStudents][numberOfSubject];

        for (int studentIndex = 0; studentIndex < theGrades.length; studentIndex++) {
            System.out.println("STUDENT-ID = " + studentIndex + 1);
            for (int subjectIndex = 0; subjectIndex < theGrades[studentIndex].length; subjectIndex++) {
                System.out.println("Enter the Score for SUBJECT " + subjectIndex + 1);
                int score = input.nextInt();
                theGrades[studentIndex][subjectIndex] = score;
            }
        }

        System.out.printf("The Scores are %n%n");
        System.out.print("                ");

        for (int subjects = 0; subjects < theGrades[0].length; subjects++) {
            System.out.printf("Subject%3d   ", subjects + 1);
        }

        System.out.print("Average");
        System.out.print("        ");
        System.out.println("Total");
        for (int students = 0; students < theGrades.length; students++) {
            System.out.printf("Student%3d%s", students +1, "        ");

            for (int score : theGrades[students]) {
                System.out.print(score + "         ");
            }
           // double average = getAverage(theGrades[students]);
            //System.out.println("     "+ average);

            //System.out.println(total());
        }
    }
}
