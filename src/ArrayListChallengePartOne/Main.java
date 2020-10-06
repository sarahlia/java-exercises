package ArrayListChallengePartOne;

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

            }
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
