
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class AddressBook {

    static Collection<Contacts> person = new ArrayList<>();

    public void console() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----------");
            System.out.println("Choose");
            System.out.println("1. Create Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createContacts();
                    break;

                case 2:
                    editContact();
                    break;

                case 3:
                    toDelete();
                    break;


                case 4:
                    System.out.println("Exit....");
                    break;

                default:
                    System.out.println("Enter valid Option");
            }//End Switch
        }//End While Loop
    }//End Console

    // to create contacts of User
    public void createContacts() {
        Contacts contacts = new Contacts();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        contacts.setFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        contacts.setLastName(lastName);


        System.out.println("Enter City: ");
        String city = sc.nextLine();
        contacts.setCity(city);

        System.out.println("Enter State: ");
        String state = sc.nextLine();
        contacts.setState(state);

        System.out.println("Enter Zip: ");
        String zip = sc.nextLine();
        contacts.setZip(zip);

        System.out.println("Enter phoneNumber:");
        String phoneNumber = sc.nextLine();
        contacts.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email Id: ");
        String email = sc.nextLine();
        contacts.setEmail(email);

        person.add(contacts);
        System.out.println("Contact" + firstName + "created successfully");

    }

    // to edit contacts in AddressBook
    public void editContact() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name you want to edit: ");
        String first = sc.next();

        boolean isPerson = false;

        for (int i = 0; i < person.size(); i++) {
            if (((ArrayList<Contacts>) person).get(i).getFirstName().equals(first)) {

                isPerson = true;


                ((ArrayList<Contacts>) person).get(i).setFirstName(first);

                System.out.print("Enter Last Name:");
                String lastName = sc.next();
                ((ArrayList<Contacts>) person).get(i).setLastName(lastName);

                System.out.print("Enter state:");
                String state = sc.next();
                ((ArrayList<Contacts>) person).get(i).setState(state);

                System.out.print("Enter zip:");
                String zip = sc.next();
                ((ArrayList<Contacts>) person).get(i).setZip(zip);

                System.out.print("Enter phoneNumber:");
                String phoneNumber = sc.next();
                ((ArrayList<Contacts>) person).get(i).setPhoneNumber(phoneNumber);

                System.out.print("Enter email:");
                String email = sc.next();
                ((ArrayList<Contacts>) person).get(i).setEmail(email);

                System.out.println("Contact edited sucessfully");
            }

        }
        if (!isPerson)
            System.out.println("Contact could not be found");
    }

    // to delete record of User
    public void toDelete() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name of the contact to be deleted");
        String firstName = sc.next();

        for (int i = 0; i < person.size(); i++) {
            if (((ArrayList<Contacts>) person).get(i).getFirstName().equals(firstName)) {
                person.remove(((ArrayList<Contacts>) person).get(i));
                System.out.println("Contact removed successfully");
            } else {
                System.out.println("Contact not found");
            }
        }
    }

    public static void main(String[] args) {
       // Contacts contacts = new Contacts();
        AddressBook addressBook = new AddressBook();
        addressBook.console();
    }
}//End AddressBook


class Contacts {
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public String toString() {
        return "Address{" + "firstName = " + firstName + ", lastName = " + lastName
                + ", city = " + city + ", state = " + state
                + ", zipCode = " + zip + ", phoneNumber = " + phoneNumber + ", email = " + email + '}';
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


