package bankApp;

import java.util.ArrayList;
import java.util.List;

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
        else throw new IllegalArgumentException("Account not not found");
    }
    public void moneyCanBaWithdraw(int amount, String accountNumber, String  pin){
        Account found = findAccountByAccountNumber(accountNumber);
        if (found != null){
            found.withdrawMoney(amount,pin);
        }else throw new IllegalArgumentException("Account not not found");
    }
    public Account intraBankTransfer(int amount, String sendersAccountNumber, String receiversAccountNumber, String pin){
        Account foundSendersAccount = findAccountByAccountNumber(sendersAccountNumber);
        if (foundSendersAccount != null) foundSendersAccount.withdrawMoney(amount, pin);
        else throw new IllegalArgumentException("Account not not found");

        Account foundReceiversAccount = findAccountByAccountNumber(receiversAccountNumber);
        if (foundReceiversAccount != null) foundReceiversAccount.depositMoney(amount);
        else throw new IllegalArgumentException("Account not not found");
        return foundReceiversAccount;
    }
    public int checkBalance(String accountNumber, String pin){
        Account getAccountNumber = findAccountByAccountNumber(accountNumber);
        if (getAccountNumber.getPin().equals(pin)){
            return getAccountNumber.getBalance();
        }
        throw new IllegalArgumentException("Account not not found");
    }
    public List <Account> findAllAccount(){
        return accounts;
    }
    public void deleteAccount(String accountNumber){
        Account findAccount = findAccountByAccountNumber(accountNumber);
        accounts.remove(findAccount);
    }
    public int size(){
        return  size++;
    }
}
