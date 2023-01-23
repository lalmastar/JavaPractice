package GFG.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leaders_in_an_array {
    void printLeaders1(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            int sum = 0;
                for(int j=i+1; j<n; j++){
                    sum += arr[j];
                }
                if(arr[i]>=sum) {
                    System.out.print(arr[i]+" ");
                }
                if(n-2 == i){
                    System.out.print(arr[n-1]);
                }
        }
    }
    void printLeaders2(int[] arr, int n){
        int max_from_right = arr[n-1];
        System.out.print(max_from_right+" ");

        for (int i = n-2; i >= 0; i--) {
            if(max_from_right < arr[i]){
                max_from_right = arr[i];
                System.out.print(max_from_right+" ");
            }
        }
    }
    static ArrayList<Integer> printLeaders3(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n-1]);

        for (int i = n-2; i >= 0 ; i--) {
            if(max < arr[i]){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        Leaders_in_an_array obj = new Leaders_in_an_array();
        int[] arr = {16,17,4,3,5,2};
//        int[] arr = {1,2,3,4,0};
        int n = arr.length;
        obj.printLeaders1(arr,n);
        System.out.println();
        System.out.println(printLeaders3(arr,n));

    }
}
