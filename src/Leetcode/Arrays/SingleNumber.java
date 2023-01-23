package Leetcode.Arrays;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] arr){
        Arrays.sort(arr);
        boolean flag = false;
        if(arr.length % 2 != 0) flag = true;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i] == arr[i+1]){
                i++;
            }else{
                return arr[i];
            }
        }
        if(flag){
            return arr[arr.length-1];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2,4,3};
        System.out.println(singleNumber(arr));
    }
}
