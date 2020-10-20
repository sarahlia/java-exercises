package ArrayListChallenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("021-789-1088");

    public static void main(String[] args) {
        boolean quit = false;

        startPhone();
        printActions();

        while(!quit) {
            System.out.println("Enter action: (6 - show menu)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add " + name + ", already on file.");
        }

    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if(existingContactRecord == null) {
            System.out.println("Contact not found");
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if(existingContactRecord == null) {
            System.out.println("Contact not found");
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if(existingContactRecord != null) {
            System.out.println("Name: " + existingContactRecord.getName() + ", phone number is " + existingContactRecord.getPhoneNumber());
        } else {
            System.out.println("Contact not found");
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone... \n");
    }

    private static void printActions() {
        System.out.println("Available actions: \n press");
        System.out.println("0 - shut down");
        System.out.println("1 - print contacts");
        System.out.println("2 - add a new contact");
        System.out.println("3 - update an existing contact");
        System.out.println("4 - remove an existing contact");
        System.out.println("5 - query if a contact exists");
        System.out.println("6 - show menu");
        System.out.println("Select an option: ");
    }
}
