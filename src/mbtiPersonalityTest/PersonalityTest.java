package mbtiPersonalityTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PersonalityTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]  questions = new String[40];
        List<String> responses = new ArrayList<>();

        int countForA10 = 0;
        int countForA20 = 0;
        int countForA30 = 0;
        int countForA40 = 0;
        int countForB10 = 0;
        int countForB20 = 0;
        int countForB30 = 0;
        int countForB40 = 0;


        System.out.println("Enter your first name: ");
        String firstName = input.next();
        System.out.println("Enter your sure name: ");
        String surname = input.next();

        questions[0] = "A. expend energy, enjoy groups  ";
        questions[1] = "B. converse energy, enjoy one-on-one.";
        questions[2] = "A. interpret literally ";
        questions[3] = "B. look for meaning and possibilities";
        questions[4] = "A. logical, thinking, questioning ";
        questions[5] = "B. empathetic, feeling, accommodating";
        questions[6] = "A. organized, orderly ";
        questions[7] = "B. flexible, adaptable";
        questions[8] = "A. more outgoing, think out loud ";
        questions[9] = "B. more reserved, think to yourself";
        questions[10]= "A. practical, realistic, experiential ";
        questions[11]= "B. imaginative, innovative, theoretical";
        questions[12]= "A. candid, straight forward, frank ";
        questions[13]= "B. tactful, kind, encouraging";
        questions[14]= "A. plan, schedule ";
        questions[15]= "B. unplanned, spontaneous";
        questions[16]= "A. seek many tasks, public activities, interaction with others ";
        questions[17]= "B. seek private, solitary activities with quiet to concentrate";
        questions[18]= "A. standard, usual, conventional ";
        questions[19]= "B. different, novel, unique";
        questions[20]= "A. firm, tend to criticize, hold the line ";
        questions[21]= "B. gentle, tend to appreciate, conciliate";
        questions[22]= "A. regulated, structured ";
        questions[23]= "B. easygoing, “live” and “let live”";
        questions[24]= "A. external, communicative, express yourself ";
        questions[25]= "B. internal, reticent, keep to yourself";
        questions[26]= "A. focus on here-and-now ";
        questions[27]= "B. look to the future, global perspective, “big picture”";
        questions[28]= "A. tough-minded, just ";
        questions[29]= "B. tender-hearted, merciful";
        questions[30]= "A. preparation, plan ahead ";
        questions[31]= "B. go with the flow, adapt as you go";
        questions[32]= "A. active, initiate ";
        questions[33]= "B. reflective, deliberate";
        questions[34]= "A. acts, things, “what is”";
        questions[35]= "B. ideas, dreams, “what could be,” philosophical";
        questions[36]= "A. matter of fact, issue-oriented";
        questions[37]= "B. sensitive, people-oriented, compassionate";
        questions[38]= "A. control, govern";
        questions[39]= "B. latitude, freedom";

        for (int index = 0; index < questions.length; index+=2) {
            System.out.println(questions[index] +" "+ questions[index+1]);
            String answer = input.next();
            while (!Objects.equals(answer, "A") && !Objects.equals(answer, "B")){
                System.out.println("\nExpected A or B");
                System.out.println("I know this is an error, Please try again.");
                System.out.println(questions[index] +" "+ questions[index+1]);
                answer = input.next();
            }
            if(answer.equalsIgnoreCase("A")){
                responses.add(questions[index]);
                if(index < 10) {
                    countForA10++;
                } else if (index < 20){
                    countForA20++;
                } else if (index < 30) {
                    countForA30++;
                } else {
                    countForA40++;
                }
            }
            else if(answer.equalsIgnoreCase("B")){
                responses.add(questions[index+1]);
                if(index < 10) {
                    countForB10++;
                } else if (index < 20){
                    countForB20++;
                } else if (index < 30) {
                    countForB30++;
                } else {
                    countForB40++;
                }
            }

        }
        System.out.println("\nHello "+firstName+ " "+surname +", You selected;");

        for (int i = 0; i < 5; i++) {
            System.out.println(responses.get(i));
        }
        System.out.println("\nNumber of A selected: " + countForA10);
        System.out.println("Number of B selected: " + countForB10);
        System.out.println();
        for (int i = 5; i < 10; i++) {
            System.out.println(responses.get(i));
        }
        System.out.println("\nNumber of A selected: " + countForA20);
        System.out.println("Number of B selected: " + countForB20);
        System.out.println();
        for (int i = 10; i < 15; i++) {
            System.out.println(responses.get(i));
        }
        System.out.println("\nNumber of A selected: " + countForA30);
        System.out.println("Number of B selected: " + countForB30);
        System.out.println();
        for (int i = 15; i < 20; i++) {
            System.out.println(responses.get(i));
        }
        System.out.println("\nNumber of A selected: " + countForA40);
        System.out.println("Number of B selected: " + countForB40);
    }
}