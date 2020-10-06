package ArrayListChallengePartOne;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact already on file.");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0 ) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0 ) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }

    //Will only be used within this class.
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact); //If exists in the ArrayList, will return 0 or greater. If not, will return a number less than 0.
    }

    //Overloading.
    //In the parameter, pass the contactName, then loop through all the elements in the ArrayList to check whether the name is equal to the name that's been passed.
    //If it is, we'll return its position. If it's not there, we'll return -1.
    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i; //found. Return the position.
            }
        }
        return -1; //not found.
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName(); //if the result of method in line 37 is 0 or greater(found), return the contact's name.
        }
        return null; //if not found, return null.
    }


}
