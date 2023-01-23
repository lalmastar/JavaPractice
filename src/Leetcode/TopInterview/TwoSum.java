package Leetcode.TopInterview;
import java.util.*;
public class TwoSum {
    public static void twoSum(int[] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]+arr[i+1]==target){
                System.out.println(i+" "+(i+1));
            }
        }
    }
    public static int[] twoSum1(int[] arr, int target){
        int[] arr1=new int[2];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(target==arr[i]+arr[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
//        twoSum(arr,target);
        System.out.println(Arrays.toString(twoSum1(arr,target)));
    }
}
