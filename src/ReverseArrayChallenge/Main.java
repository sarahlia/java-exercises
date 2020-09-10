package ReverseArrayChallenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

        int[] arr = {3, 6, 9, 12, 15, 18};
        System.out.println(Arrays.toString(arr));

        m.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }

}
