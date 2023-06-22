package bankAppTest;

import bankApp.Account;
import bankApp.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank = new Bank();

    @BeforeEach
    public void startWith(){
        Account certain = bank.createAccount("Mabel","Okolo", "09087654321","1234");
        Account certain2 = bank.createAccount("Mabelly","Okolo", "0901234567","1234");
        Account certain3 = bank.createAccount("Ben","Akanu", "09087654323","1234");
        Account certain4 = bank.createAccount("great","Akanu", "09087654324","1234");

    }
    @Test public void bankExistsTest(){
        assertNotNull(bank);
    }
    @Test public void accountCanBeCreatedTest(){
        Account certain = bank.createAccount("Mabel","Okolo", "09087654321","1234");
        Account certain2 = bank.createAccount("Mabelly","Okolo", "0901234567","1234");
        assertNotNull(certain);
        System.out.println(certain);
        System.out.println(certain2);
        System.out.println(certain.getAccountNumber());
    }
    @Test public void accountCanBeFoundTest(){
        Account vizz = bank.findAccountByAccountNumber("9087654321");
        assertEquals("9087654321", vizz.getAccountNumber());
    }
    @Test public void multipleAccountUsersCanBeFoundTest(){
        Account acc1 = bank.findAccountByAccountNumber("9087654321");
        assertEquals("9087654321", acc1.getAccountNumber());
        Account acc2 = bank.findAccountByAccountNumber("901234567");
        assertEquals("901234567", acc2.getAccountNumber());
        Account acc3 = bank.findAccountByAccountNumber("9087654323");
        assertEquals("9087654323", acc3.getAccountNumber());
    }
    @Test public void moneyCanBeTransferredTest(){
        bank.moneyCanBeDepositedIntoBank(8_000,"9087654321");
        assertEquals(8_000,bank.checkBalance("9087654321","1234"));

        Account ben = bank.intraBankTransfer(8_000,"9087654321","901234567","1234");
        assertEquals(8000,ben.getBalance());


    }
    @Test public void allCountsInTheBankCanBeFoundTest(){

        //assertEquals(4,bank.size());

    }


}



