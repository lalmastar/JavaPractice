package CodeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lucky_Four {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            int rem = 0;
            while(n>0){
                rem = n%10;
                if(rem == 4){
                    count++;
                }
                n/=10;
            }
            System.out.println(count);
        }
    }
}
