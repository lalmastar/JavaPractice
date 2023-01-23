package CodeChef.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Motivation {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int x = Integer.parseInt(str[1]);
            int max = 0;
            for (int i = 0; i < n; i++) {
                String[] st = br.readLine().split(" ");
                int s = Integer.parseInt(st[0]);
                int r = Integer.parseInt(st[1]);
                if(s<=x && r>max){
                    max = r;
                }
            }
            System.out.println(max);
        }
    }
}
