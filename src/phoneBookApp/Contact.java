package phoneBookApp;

public class Contact {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int size;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString2(){
        return String.format("""
                        First Name: %s
                        Last Name: %s
                        Phone Number: %s
                        """, firstName,lastName,phoneNumber);

    }
    @Override
    public String toString(){
        return String.format("""
                ===================
                First Name: %s%n
                Last Number: %S%n
                Phone Number: %S%n
                ===================
                """, firstName,lastName,phoneNumber);
    }


}
