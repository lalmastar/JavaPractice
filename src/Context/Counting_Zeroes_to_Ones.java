package Context;

import java.util.Arrays;
import java.util.Scanner;

public class Counting_Zeroes_to_Ones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
