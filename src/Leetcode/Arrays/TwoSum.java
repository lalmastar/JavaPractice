package Leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum1(int[] arr, int n, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                int left = map.get(arr[i]);
                return new int[]{left, i};
            }else{
                map.put(target-arr[i], i);
            }
        }
        return new int[2];
    }
    public static int[] twoSum2(int[] arr, int n, int target){
//        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
//        return null;
        return new int[2];
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int n = arr.length;
        int target = 6;
        System.out.println(Arrays.toString(twoSum2(arr, n, target)));
    }
}
