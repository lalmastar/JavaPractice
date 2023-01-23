package CodeChef.One_to_Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chef_and_Spells {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            int max = 0;
            if((a+b) > max){
                max = a+b;
            }
            if((a+c) > max){
                max = a+c;
            }
            if((b+c) > max){
                max = b+c;
            }
            System.out.println(max);
        }
    }
}
