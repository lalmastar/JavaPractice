package Newton_Revision.DSA_1;

import java.util.Scanner;

public class Alternate_Sum_product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int Sum = 0;
        int Product = 1;
        for (int i = 0; i <n; i++) {
            if (arr[i] % 2 == 0) {
                Sum += arr[i];
            } else {
                Product *= arr[i];
            }
        }
        System.out.println(Sum+" "+Product);
    }
}
