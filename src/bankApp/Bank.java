package bankApp;

import phoneBookApp.PhoneBook;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank {

    private int size;
    private ArrayList<Account> accounts = new ArrayList<>();


    public Account  createAccount(String firstName, String lastName, String phoneNumber, String pin){
        String acct = generateAccountNumber(phoneNumber);
        String accountName = firstName +" "+lastName;
        Account account = new Account(accountName,phoneNumber, acct, pin);
        accounts.add(account);
        return account;

    }
    public Account findAccountByAccountNumber(String accountNumber){

        for(Account account : accounts){
            if(account.getAccountNumber().equals( accountNumber))
                return account;
            }
        throw new IllegalArgumentException("Account not found");

        }
   public String generateAccountNumber(String phoneNumber){
        return phoneNumber.substring(1);

   }
    public void moneyCanBeDepositedIntoBank(int amount, String accountNumber){

        Account found = findAccountByAccountNumber(accountNumber);
        if (found != null) {
            found.depositMoney(amount);
        }
        else throw new IllegalArgumentException("Account not found");
    }
    public void moneyCanBaWithdraw(int amount, String accountNumber, String  pin){
        Account found = findAccountByAccountNumber(accountNumber);
        if (found != null){
            found.withdrawMoney(amount,pin);
        }else throw new IllegalArgumentException("Account not found");
    }
    public Account intraBankTransfer(int amount, String sendersAccountNumber, String receiversAccountNumber, String pin){
        Account foundSendersAccount = findAccountByAccountNumber(sendersAccountNumber);
        if (foundSendersAccount != null) foundSendersAccount.withdrawMoney(amount, pin);
        else throw new IllegalArgumentException("Account not found");

        Account foundReceiversAccount = findAccountByAccountNumber(receiversAccountNumber);
        if (foundReceiversAccount != null) foundReceiversAccount.depositMoney(amount);
        else throw new IllegalArgumentException("Account not found");
        return foundReceiversAccount;
    }
    public int checkBalance(String accountNumber, String pin){

        Account getAccountNumber = findAccountByAccountNumber(accountNumber);
        if (getAccountNumber.getPin().equals(pin)){
            return getAccountNumber.getBalance();
        }
        throw new IllegalArgumentException("Account not found");
    }
    public List<Account> findAllAccount(){
        return accounts;
    }
    public void deleteAccount(String accountNumber){
        Account findAccount = findAccountByAccountNumber(accountNumber);
            accounts.remove(findAccount);
    }
    public int size(){
        return  size++;
    }

    public static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }
    public static String input(String prompt) {
        //display(prompt);
        return JOptionPane.showInputDialog(prompt);
        //return KeyboardInputCollector.nextLine();
    }
    public static boolean isValidNigerianPhoneNumber(String phoneNumber) {
        String regexPattern = "^(080|081|090|070|091)\\d{8}$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

}
