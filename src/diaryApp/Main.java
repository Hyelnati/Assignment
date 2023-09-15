package diaryApp;

import javax.swing.*;

public class Main {
    private static final Diary diary = new Diary();
    private static final Diaries diaries = new Diaries();
    public static void main(String[] args) {

    }
    public static void startWith(){
        String menu = """
                ***********************
                1: Create Login details
                2: Login
                3: Exit
                ***********************
                """;
        String userInput = input(menu);
    }
    private static void createLoginDetails(){

    }
    private static void login(){
        String email = input("Enter your email: ");
        String passWord = input("PassWord: ");
        display("Login credentials successful.");
        //Diary diary = new Diary(userName,passWord);
        display(String.valueOf(diary));
        startWith();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }

}
