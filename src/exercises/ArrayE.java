package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayE {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[5];

    public static void main(String[] args) {

//        int[] myIntegers = getIntegers(5);
//        int[] sorted = sortIntegers(myIntegers);
//        printArray(sorted);

        System.out.println("Enter 5 integers: ");
        getInput();
        printArray(baseData);

        resizeArray();
        baseData[5] = 8;
        baseData[6] = 9;
        printArray(baseData);

    }

    private static void getInput() {
        for(int i = 0; i < baseData.length; i++) {
            baseData[i] = scanner.nextInt();
        }
    }

    private static void resizeArray() {

        int[] original = baseData;

        baseData = new int[7];
        for(int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); //just an extra line
    }

    public static int[] sortIntegers(int[] array) { //method to sort integers in descending order.
//        int[] sortedArray = new int[array.length]; //Create a new array with the same length as the original array,
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i]; //copy the values to the new array from the original array.
//        }

        //another way to copy an array with the same length (rather than doing lines 33-36 above):
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            //element 0     50    160
            //element 1     160   50
            //element 2     40    40
            for(int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) { //if element 0 (50) is less than element 1 (160), go to line 50 etc. //is element 1 (50) less than element 2 (40)? No. So we don't proceed to line 50. We go to line 44, then: //is element 0 (160) less than element 1 (50)? No. So we go to line 44 again. Is element 1 (50) less than element 2 (40)? No, so we exit the while loop, then we go to line 57.
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp; //we swap the values. So now element 0=160, element 1=50,
                    flag = true;//so we go through the while loop again.
                }
            }
        }
        return sortedArray;
    }

}
