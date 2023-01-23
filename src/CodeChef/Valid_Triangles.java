package CodeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Valid_Triangles {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int t = Integer.parseInt(s[0]);
//        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            if((a+b+c) == 180){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
