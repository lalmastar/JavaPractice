package CodeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class First_and_Last_Digit {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int fSum = 0;
            int lSum = n%10;
            while (n>0){
                fSum  = n%10;
                n/=10;
            }
            System.out.println(fSum+lSum);
        }
    }
}
