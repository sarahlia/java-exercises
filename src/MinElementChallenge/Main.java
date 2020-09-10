package MinElementChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE; //we set the min to Integer.MAX_VALUE b/c every number the user enters must be = or less than the maximum value an integer can contain

        for(int i = 0; i < array.length; i++) {
            int value = array[i];

            if(value < min) { //if the value is smaller than min (=we found the smallest number), we assign that value to the min variable
                min = value;
            }
        }
        return min;
    }
}
