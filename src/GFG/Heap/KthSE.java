package GFG.Heap;// Java Program to find maximum

import java.lang.*;
import java.util.*;

public class KthSE {

    // Utility function to check number of elements
    // having set msb as of pattern
    static int checkBit(int pattern, int arr[], int n)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
            if ((pattern & arr[i]) == pattern)
                count++;
        return count;
    }

    // Function for finding maximum and value pair
    static int maxAND(int arr[], int n)
    {
        int res = 0, count;

        // iterate over total of 32bits
        // from msb to lsb
        for (int bit = 31; bit >= 0; bit--) {
            // find the count of element
            // having set msb
            count = checkBit(res | (1 << bit), arr, n);

            // if count >= 2 set particular
            // bit in result
            if (count >= 2)
                res |= (1 << bit);
        }

        return res;
    }

    public static void main(String argc[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=input.nextInt();
        }
        System.out.println(maxAND(arr, n));
    }
}
