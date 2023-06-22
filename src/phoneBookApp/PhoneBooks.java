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
        return null;
    }
    public void deletePhonebook(String input){
        PhoneBook phoneBook = findPhoneBook(input);
        phoneBooks.remove(phoneBook);
    }
    public void login(String email, String password){
        PhoneBook loggedIn = findPhoneBook(email);
        if (loggedIn.getPassword().equals(password)){
            return;
        }
        throw new IllegalArgumentException("Invalid Login Credentials");
    }

}
