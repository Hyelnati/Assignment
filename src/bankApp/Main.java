package bankApp;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    private static final Bank opay = new Bank();

    public static void main(String[] args) {
        startWith();
    }

    public static void gotoMainMenu(){
        String myMenu = """
                __________________________
                __________________________
                Welcome to Opay
                choose an option.
                1: Create Account
                2: Deposit
                3: Withdraw
                4: Transfer
                5: Check Balance
                6: search account
                7: Delete Account
                0: Exit
                __________________________
                __________________________
                """;
        String userInput = input(myMenu);
        switch(userInput.charAt(0)){
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> balance();
            case '6' -> searchAccount();
            case '7' -> deleteAccount();
            case '0' -> exit();
            default -> gotoMainMenu();
        }
    }
    public static  void startWith(){
        String menu= """
                NOTICE! NOTICE! NOTICE!
                    This is an unfinished Bank app, handle with care and
                    PLEASE dont break my code.
                    Thanks.
                1: StartApp""";
        String userInput = input(menu);
        switch (userInput.charAt(0)) {
            case '1' ->gotoMainMenu();
            default -> startWith();
        }
    }

    private static void createAccount(){
        String firstName = input("Enter First Name: ");
        String lastName = input("Enter Last Name: ");
        String phoneNumber;
        while (true){
            phoneNumber = input("Phone Number: ");
            if (isValidNigerianPhoneNumber(phoneNumber)){
                break;
            }else display("Incorrect Number");

        }
        String pin = input("Set your Pin: ");
        display("Account creation successful");
        try{
            display( "" + opay.createAccount(firstName,lastName,phoneNumber,pin));
        } catch (IllegalArgumentException error){
            display(error.getMessage());
            createAccount();
        }


        gotoMainMenu();
    }

    private static void deposit(){
        int amount = Integer.parseInt(input("Enter amount to deposit: "));
        String accountNumber = input("Enter receivers account Number: ");
        try {
            opay.moneyCanBeDepositedIntoBank(amount, accountNumber);
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
        }
        String input1 = "depsit successful";
        //System.out.println(input1);
        display(input1);
        gotoMainMenu();
    }

    private static void withdraw(){
        try {
            int amount = Integer.parseInt(input("Enter amount to withdraw"));
            String accountNumber = input("Enter aacount number: ");
            String pin = input("input your pin: ");
            opay.moneyCanBaWithdraw(amount, accountNumber, pin);
            display("Withdrawal successful");
        } catch(Exception exception){
            display(exception.getMessage());

        }

        gotoMainMenu();
    }

    private static void transfer(){
        int amount = Integer.parseInt(input("Enter amount: "));
        String sendersAccount = input("Sender's Account Number: ");
        String receiversAccountNumber = input("receiver's Account Number: ");
        String pin = input("Enter your pin: ");
        try {
            display(String.valueOf(opay.intraBankTransfer(amount,sendersAccount,receiversAccountNumber,pin)));
            display("Transfer Successful");
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
        }


        gotoMainMenu();

    }
    private static void balance(){
       try {
           String accountNumber = input("Enter account number: ");
           String pin = input("Enter your pin: ");
           String accountBalance = String.format("""
                   Your account balance is %s""", opay.checkBalance(accountNumber, pin));
           display(accountBalance);
       }
       catch (Exception exception){

           display(exception.getMessage());
       }
        gotoMainMenu();

    }
    private static void deleteAccount(){
        String accountNumber = input("Enter account number: ");
        try{
            opay.deleteAccount(accountNumber);
            display("Account deleted successfully");
        }catch (Exception error){
            display(error.getMessage());
        }
        gotoMainMenu();
    }
    private static void searchAccount(){
        //String accountNumber = input("Enter Account Number: ");
        display(opay.findAllAccount().toString());
        gotoMainMenu();
    }
    public static String input(String prompt) {
        //display(prompt);
        return JOptionPane.showInputDialog(prompt);
        //return KeyboardInputCollector.nextLine();
    }
    private static void display(String prompt){
            JOptionPane.showMessageDialog(null,prompt);
    }
    private static void exit(){
        display("Have a nice day");
        System.exit(1);

    }
    public static boolean isValidNigerianPhoneNumber(String phoneNumber) {
        String regexPattern = "^(080|081|090|070|091)\\d{8}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

}
