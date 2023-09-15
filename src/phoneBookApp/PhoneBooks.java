package phoneBookApp;

import java.util.ArrayList;
import java.util.List;

public class PhoneBooks{
    private List<PhoneBook> phoneBooks = new ArrayList<>();

    public PhoneBook createPhoneBook(String firstName, String lastName,String email, String phoneNumber, String password){
        PhoneBook phoneBook = new PhoneBook(firstName, lastName, email, phoneNumber, password);
        phoneBooks.add(phoneBook);
        return phoneBook;
    }
    public PhoneBook findPhoneBook(String input){
        for (PhoneBook phoneBook: phoneBooks){
            if (phoneBook.getEmail().equals(input) || phoneBook.getPhoneNumber().equals(input)){
                return phoneBook;
            }
        }
        throw new IllegalArgumentException("Contact not found");
    }
    public void deletePhonebook(String input){
        PhoneBook phoneBook = findPhoneBook(input);
        phoneBooks.remove(phoneBook);
    }
    public PhoneBook login(String email, String password){
        PhoneBook loggedIn = findPhoneBook(email);
        if (loggedIn.getPassword().equals(password)){
            return loggedIn;
        }
        throw new IllegalArgumentException("Invalid Login Credentials");
    }

}
