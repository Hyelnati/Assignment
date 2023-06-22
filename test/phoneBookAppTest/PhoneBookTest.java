package phoneBookAppTest;


import org.junit.jupiter.api.Test;
import phoneBookApp.Contact;
import phoneBookApp.PhoneBook;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();


    @Test public  void contactCanBeAddedTest(){
        phoneBook.createContact("jude", "ade", "09076543321");
        phoneBook.createContact("jude", "ade", "09876543321");
        phoneBook.createContact("jude", "ade", "09876543321");
        assertEquals(3, phoneBook.contactSize());
    }
    @Test public void findContactTest(){
        //phoneBook.createContact("jude", "ade", "09076543321");
        //phoneBook.findContact("jude");
        Contact expected = phoneBook.createContact("jude","ade", "09076543321");
        assertEquals(expected, phoneBook.findContact("jude"));

    }
    @Test public void findAllContactsTest(){
        phoneBook.createContact("jude", "ade", "09876543321");
        phoneBook.createContact("jude", "ade", "09876543321");
        phoneBook.createContact("jude", "ade", "09876543321");
        phoneBook.findAllContact();
        assertEquals(3, phoneBook.contactSize());
    }
    @Test public void firstNameCanBeUpdatedTest(){
        phoneBook.createContact("jude", "ade", "09876543321");
        //phoneBook.updateFirstName("jude","Sam");
        assertEquals("Sam",phoneBook.updateFirstName("jude","Sam"));

    }
}

