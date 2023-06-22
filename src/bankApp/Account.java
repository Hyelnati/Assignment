package bankApp;

import java.util.Objects;

public class Account {
    private String accountName;
    private String phoneNumber;
    private String accountNumber;
    private int balance;
    private String pin;
    public Account(String accountName, String phoneNumber, String accountNumber, String pin) {
        this.accountName = accountName;
        this. phoneNumber = phoneNumber;
        this. accountNumber = accountNumber;
        this.pin = pin;
    }

    public void depositMoney(int amount) {
        if (amount ==0) throw new IllegalArgumentException("Please deposit the wright amount");
        else if(amount < 0) throw new IllegalArgumentException("Please deposit the wright amount");
        else
            balance +=amount;
    }

    public int getBalance() {
        return balance;
    }
    public void withdrawMoney(int amount, String pin) {
        if (!Objects.equals(this.pin, pin)) throw new IllegalArgumentException("Wrong pin, try again");
        if(amount > balance || amount <=0) throw new IllegalArgumentException("Insufficient fund");
        else balance -=amount;

    }

    public String getAccountName() {
        return accountName;

    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        //validateAccountName();
    }

    private void validatePin(){
        if (!pin.equals("4")) throw new IllegalArgumentException("Pin must be four digits");
//        if (pin.equals(" ")) throw new IllegalArgumentException("Pin must be four digits");
//        else if (!pin.equals("4")) throw new IllegalArgumentException("Pin must be four digits");
//
    }
    private void validateAccountName(String firstName, String lastName){
       // if(!firstName.equals() || !lastName.equals(" ")) throw new IllegalArgumentException("First Name can only be in alphabet");
    }
    public void setPin(String pin){
        this.pin = pin;
        validatePin();
    }
    public String getPin(){
        return pin;
    }
    @Override
    public String toString(){
        return String.format("""
                =========================
                Account Name: %s%n
                Account Number: %S%n
                Current Balance: #%S%n
                """, accountName,accountNumber,balance);

    }

}
