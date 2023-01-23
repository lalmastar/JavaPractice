package Leetcode.Arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = n-1; i >= 0; i--) {
            if (arr[i] > 9){
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] newNumber = new int[n+1];
        newNumber[0] = 1;
        return newNumber;
    }
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(digits)));

    }
}
