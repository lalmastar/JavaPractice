package Context;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Wave_Array {

    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextLong();
        }

        Arrays.sort(arr);
        int j=0, k=0;
        long arr2[] = new long[n];

        while(j<n-1 && (n%2!=0)){
            swap(arr, j, j+1);
            j = j+2;
        }
        while(k<n-1 && (n%2!=0)){
            swap(arr, k, k+1);
            k = k+2;
        }
        for(long x : arr) System.out.print(x + " ");
    }
    public static void swap(long arr[], int i, int j){
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}