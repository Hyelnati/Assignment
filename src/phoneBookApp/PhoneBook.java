package phoneBookApp;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private LocalDate dateCreated = LocalDate.now();

    private ArrayList<Contact> contacts = new ArrayList<>();

    public PhoneBook(){
    }

    public PhoneBook(String fName, String lastName, String email, String phoneNumber, String password){
        this.firstName = fName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    Contact contact;

    public Contact createContact(String firstName, String lastName, String phoneNumber){
        contact = new Contact(firstName,lastName,phoneNumber);
        contacts.add(contact);
        return contact;
    }

    public Contact findContact(String userInput){
        for (Contact contact: contacts){
            if (contact.getFirstName().equals(userInput) || contact.getPhoneNumber().equals(userInput) ||contact.getLastName().equals(userInput)){
                return contact;
            }
        }
        throw new IllegalArgumentException("Contact not found");
    }

    public List<Contact> findAllContact(){

        return contacts;
    }

    public void deleteContact(String userInput){
        Contact findMyContactToDelete = findContact(userInput);
        contacts.remove(findMyContactToDelete);
    }

    public String updateFirstName(String firstName, String userInput){
        String newName= null;
        for (Contact contact: contacts){
            if (contact.getFirstName().equals(firstName)){
                contact.setFirstName(userInput);
                newName = contact.toString2();
            } else throw new IllegalArgumentException("Contact Not Found");
        }
        return newName;
    }
    public String updatePhoneNumber(String phoneNumber, String userInput){
        String newPhoneNumber = null;
        for (Contact contact: contacts){
            if (contact.getPhoneNumber().equals(phoneNumber)){
                contact.setPhoneNumber(userInput);
                newPhoneNumber = contact.toString2();
            } else throw new IllegalArgumentException("Number not found");
        }
        return newPhoneNumber;
    }

    public String updateLastName(String lastName, String userInput){
        String newLastName = null;
        for (Contact contact: contacts){
            if (contact.getLastName().equals(lastName)){
                contact.setLastName(userInput);
                newLastName = contact.toString2();
            } else throw new IllegalArgumentException("Last Name not found");
        }
        return newLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString(){
        return String.format("""
                ===================
                First Name: %s
                Last Name: %s
                Phone Number: %s
                E-mail: %s
                Date Created: %s
                ===================
                """, firstName, lastName, phoneNumber, email, dateCreated );
    }

    public static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }



    public int contactSize() {
        return contacts.size();
    }
}
