package GFG.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Reverse_array_in_groups {
    public static void reverseInGroup(int[] arr, int n, int k){
        for (int i = 0; i < n; i+=k) {
            int left = i;
            int right = Math.min(i+k-1, n-1);
            int temp;
            while(left<right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for (int a: arr) {
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;
        reverseInGroup(arr,n,k);

    }
}
