package bankAppTest;

import bankApp.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account = new Account("Timi", "Leyi", "09023456781", "123");

    @BeforeEach
    //public void startWith() {
    //}
    @Test
    public void accountClassCanBeCreatedTest() {
        assertNotNull(account);
    }
    @Test
    public void moneyCanBeDepositedIntoAccountTest() {
        account.depositMoney(7_000);
        assertEquals(7_000, account.getBalance());
    }
    @Test
    public void moneyCanBeDepositedIntoAccountTwiceTest() {
        account.depositMoney(7_000);
        account.depositMoney(7_000);
        assertEquals(14_000, account.getBalance());
    }
    @Test
    public void negativeAmountCannotBeDepositedTest() {
        assertThrows(IllegalArgumentException.class,()->account.depositMoney(-7000));
        assertEquals(0,account.getBalance());
    }

    @Test
    public void moneyCanBeWithdrawnFromAccountTEST() {
        account.depositMoney(7_000);
        assertEquals(7_000, account.getBalance());
        account.withdrawMoney(2_000,"123");
        assertEquals(5_000, account.getBalance());
    }
    @Test
    public void moneyCanBeWithdrawnFromAccountTwiceTest() {
        account.depositMoney(7_000);
        assertEquals(7_000, account.getBalance());
        account.withdrawMoney(2_000, "123");
        account.withdrawMoney(2_000,"123");
        assertEquals(3_000, account.getBalance());
    }
    @Test public void negativeAmountCannotBeWithdrawnTest(){
        account.depositMoney(7_000);
        assertEquals(7_000, account.getBalance());
        assertThrows(IllegalArgumentException.class, () -> account.withdrawMoney(-2_000, "123"));
        assertEquals(7_000, account.getBalance()); //
        //account.withdrawMoney(-2_000,"123");
        //assertThrows(IllegalArgumentException.class,()->account.getBalance());
    }
    @Test public void youCannotWithdrawMoreThanBalanceTest(){
        account.depositMoney(7_000);
        assertEquals(7_000, account.getBalance());
        assertThrows(IllegalArgumentException.class, () ->account.withdrawMoney(8_000,"123"));
        assertEquals(7_000, account.getBalance());
    }
}
