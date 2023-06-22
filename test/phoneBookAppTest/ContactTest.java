package phoneBookAppTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phoneBookApp.Contact;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    Contact contact;
    @BeforeEach
    public void startWith(){
        contact = new Contact("John","Del", "08098765432");

    }
    @Test public void contactClassExistTest(){
        assertNotNull(contact);
    }
    @Test public void phoneNumberCanBeAddedTest(){
        contact.setPhoneNumber("");
        assertThrows(IllegalArgumentException.class,()-> contact.setPhoneNumber("09087654321"));
        assertEquals("09087654321", contact.getPhoneNumber());


    }
}
