package GFG.Arrays;

import java.util.Arrays;

public class Sort_an_array_of_0s_1s_and_2s {
    public static void sort012(int [] arr, int n){
       int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            switch (arr[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        int i = 0;
        while (count0 > 0){
            arr[i++] = 0;
            count0--;
        }
        while (count1 > 0){
            arr[i++] = 1;
            count1--;
        }
        while(count2 > 0){
            arr[i++] = 2;
            count2--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr= {0, 2, 1, 2, 0,1,2,1,2,0};
        int n = arr.length;
        sort012(arr,n);
    }
}
