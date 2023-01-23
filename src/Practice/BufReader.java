package Practice;
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;

public class BufReader {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(isr);

// ******************************************************************
//		int n=Integer.parseInt(input.readLine());
//		int[] arr=new int[n];
//
//		String[] strNums = input.readLine().split(" ");
//		for (int i = 0; i < strNums.length; i++) {
//            arr[i] = Integer.parseInt(strNums[i]);
//        }
//
//        for (int i = 0; i < strNums.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
// ******************************************************************

//		String[] str1=input.readLine().split(" ");
        int n1=Integer.parseInt(input.readLine());
        int n2=Integer.parseInt(input.readLine());
        int[][] arr1=new int[n1][n2];

        for(int i=0; i<n1; i++) {
            String[] str2=input.readLine().split(" ");
            for(int j=0; j<n2; j++) {
                arr1[i][j]=Integer.parseInt(str2[j]);
            }
        }
        for(int i=0; i<n1; i++) {
            for(int j=0; j<n2; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }

}

