package CodeChef;

import java.io.*;

public class Reverse_The_Number {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int rev = 0;
            while(n>0){
                int rem = n%10;
                rev += rem;
                rev*=10;
                n/=10;
            }
            System.out.println(rev/10);
        }
    }
}
