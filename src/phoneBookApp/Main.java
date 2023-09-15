package phoneBookApp;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final PhoneBook myPhoneBook = new PhoneBook();
    private static final PhoneBooks ourPhone = new PhoneBooks();
    public static void main(String[] args) {
        startWith();
    }
    public static void startMenu() {
        String menu = """
                ============================
                ............................
                1: Create Phone Book
                2: Login
                3: Exit
                ============================
                ............................
                """;
        String userInput = input(menu);
        switch (userInput.charAt(0)) {
            case '1' -> createPhoneBook();
            case '2' -> login();
            case '3' -> exit();
        }
    }
    public static  void startWith(){
        String menu= """
                NOTICE! NOTICE! NOTICE!
                    This is an unfinished app, handle with care and
                    PLEASE dont break my code.
                    Thanks.
                1: StartApp""";
        String userInput = input(menu);
        switch (userInput.charAt(0)) {
            case '1' ->startMenu();
        }
    }

    public static void goToMainMenu(){
        String myMenu = """
                ____________________________
                ----------------------------
                1: Create Contact
                2: Search for Contact
                3: Update Contact
                4: Find all contacts
                5: Delete Contact
                6: Exit
                ____________________________
                ----------------------------
                """;
        String userInput = input(myMenu);
        switch (userInput.charAt(0)){
            case '1' -> createContact();
            case '2' -> searchContact();
            case '3' -> {
                String updateMenu = """
                        ______________________
                        ----------------------
                        1: Update first name
                        2: Update last name
                        3: Update phone number
                        4: back
                        ______________________
                        ----------------------
                        """;
                String newInput = input(updateMenu);
                switch (newInput.charAt(0)){
                    case '1' -> updateFirstName();
                    case '2' -> updateLastName();
                    case '3' -> updatePhoneNumber();
                }
            }
            case '4' -> findAll();
            case '5' -> deleteContact();
            case '6' -> exit();

        }
    }

    private static void findAll() {
        try{
            display("" + myPhoneBook.findAllContact());
        } catch (Exception exception) {
            display(exception.getMessage());
            findAll();
        }
        goToMainMenu();
    }

    private static void createContact(){
        String firstName = input("Firstname: ");
        String lastName = input("Last Name: ");
        String phoneNumber;
        while (true){
            phoneNumber = input("Phone Number: ");
            if (isValidNigerianPhoneNumber(phoneNumber)){
                break;
            }else display("Incorrect Number");

        }

        display("Contact created");
        Contact contact = myPhoneBook.createContact(firstName,lastName,phoneNumber);
        isValidNigerianPhoneNumber(phoneNumber);
        display(String.valueOf(contact));
        goToMainMenu();
    }
    private static void createPhoneBook(){
        String firstName = input("Enter first name: ");
        String lastName = input("Enter last name: ");
        String emailAddress = input("Enter email address: ");
        String phoneNumber;
        while (true){
            phoneNumber = input("Enter phone number: ");
            if (isValidNigerianPhoneNumber(phoneNumber)){
                break;
            }else
                display("Incorrect Number");
        }
        String password = input("input your password: ");
        PhoneBook phoneBook = ourPhone.createPhoneBook(firstName,lastName,emailAddress,phoneNumber,password);
        display(String.valueOf(phoneBook));
        startMenu();

    }
    public static void login(){
        String email = input("Enter Your Email: ");
        String password = input("Enter Your Password: ");
        try {
           ourPhone.login(email, password);
           display("login successful");
        }catch (IllegalArgumentException error){
            display(error.getMessage());
            login();
        }
        goToMainMenu();
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void searchContact(){
        String input = input("Search");
        try{
            display(String.valueOf(myPhoneBook.findContact(input)));

        } catch (Exception exception) {
            display(exception.getMessage());
            searchContact();
        }
        goToMainMenu();

    }
    private static void updatePhoneNumber(){
        String input = input("Search Contact to be Updated: ");
        try{
            display(input);
        } catch (Exception exception) {
            display(exception.getMessage());
            updatePhoneNumber();
        }
        String input2 = input("Input new Phone Number: ");
        try {
            display(String.valueOf(myPhoneBook.updatePhoneNumber(input,input2)));
        } catch (Exception exception) {
            display(exception.getMessage());
            updatePhoneNumber();

        }
        goToMainMenu();
    }
    private static void updateFirstName(){
        String input = input("Search Contact to be Updated");
        try{
            display(input);
        } catch (Exception exception){ display(exception.getMessage()); updateFirstName();}

        String input2 = input("Input new First Name: ");
        display(myPhoneBook.updateFirstName(input,input2));
        goToMainMenu();
    }
    private static void updateLastName(){
        String input = input("Search Contact to be Updated");
        display(input);
        String inout2 = input("Input new Last Name: ");
        display("" + myPhoneBook.updateLastName(input,inout2));
        goToMainMenu();
    }
    private static void deleteContact(){
        String input = input("Search");
        myPhoneBook.deleteContact(input);
        goToMainMenu();
    }
    public static void exit(){
        display("Have a nice day");
        System.exit(1);
    }
    public static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }

    public static boolean isValidNigerianPhoneNumber(String phoneNumber) {
        String regexPattern = "^(080|081|090|070|091|014)\\d{8}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

}
