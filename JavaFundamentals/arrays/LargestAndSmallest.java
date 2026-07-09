package arrays;

import java.util.Arrays;

public class LargestAndSmallest {

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 56};

        Arrays.sort(arr);

        System.out.println("Smallest Number = " + arr[0]);
        System.out.println("Second Smallest Number = " + arr[1]);

        System.out.println("Largest Number = " + arr[arr.length - 1]);
        System.out.println("Second Largest Number = " + arr[arr.length - 2]);

    }
}