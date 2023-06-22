package bankApp;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    private static final Bank opay = new Bank();
    //private static final Scanner input = new Scanner(System.in);
    //private static final Scanner KeyboardInputCollector = new Scanner(System.in);
    public static void main(String[] args) {
        gotoMainMenu();
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
                6: Delete Account
                7: Exit
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
            case '6' -> deleteAccount();
            case '7' -> exit();
            default -> gotoMainMenu();
        }
    }

    private static void createAccount(){
        String firstName = input("Enter First Name: ");
        String lastName = input("Enter Last Name: ");
        String phoneNumber = input("Enter your Phone Number: ");
        String pin = input("Set your Pin: ");
        display("Account creation successful");
        try{
            opay.createAccount(firstName,lastName,phoneNumber,pin);
        } catch (IllegalArgumentException error){
            display(error.getMessage());
        }
        System.out.println(opay.createAccount(firstName,lastName,phoneNumber,pin));

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
            withdraw();
        }

        gotoMainMenu();
    }

    private static void transfer(){
        int amount = Integer.parseInt(input("Enter amount: "));
        String sendersAccount = input("Sender's Account Number: ");
        String receiversAccountNumber = input("receiver's Account Number: ");
        String pin = input("Enter your pin: ");
        try {
            opay.intraBankTransfer(amount,sendersAccount,receiversAccountNumber,pin);
        } catch (IllegalArgumentException error) {
            display(error.getMessage());
            transfer();
        }
        display("Transfer Successful");
        display("Your new Account Balance is " + opay.checkBalance(sendersAccount, pin));
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
           balance();
       }
        gotoMainMenu();

    }
    private static void deleteAccount(){
        String accountNumber = input("Enter account number: ");
        opay.deleteAccount(accountNumber);
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
