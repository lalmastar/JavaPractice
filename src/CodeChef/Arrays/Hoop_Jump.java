package CodeChef.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hoop_Jump {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            System.out.println((n/2)+1);
        }
    }
}
