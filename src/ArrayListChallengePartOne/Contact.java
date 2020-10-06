package ArrayListChallengePartOne;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Create a public static method so that we can create a new Contact record.
    //This is static so that we can create it without creating a new object instance.
    //Line 24 calls the constructor in line 7.
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
