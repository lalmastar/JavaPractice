package CodeChef.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Two_Dishes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            int c = Integer.parseInt(str[3]);

            if((a+c)>=n && b>=n){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
