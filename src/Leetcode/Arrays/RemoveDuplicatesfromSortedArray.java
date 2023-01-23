package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {
    public static void removeDuplicates(int[] arr){
        HashSet<Integer> hashSet =new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            hashSet.add(arr[i]);
        }
        System.out.println(hashSet);
    }
    public static int removeDuplicates1(int[] arr){
        int slow = 0;
        int fast = 0;
        for (int i = 0; i <arr.length ; i++) {
            fast = i;
            if(arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
        System.out.println(removeDuplicates1(arr));
    }
}
