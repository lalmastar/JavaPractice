package CodeChef.One_to_Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programming_Languages {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            int A1 = Integer.parseInt(str[2]);
            int B1 = Integer.parseInt(str[3]);
            int A2 = Integer.parseInt(str[4]);
            int B2 = Integer.parseInt(str[5]);

            if((A == A1 && B == B1) || (A == B1 && B == A1)){
                System.out.println(1);
            }
            else if ((A == A2 && B == B2) || (A == B2 && B == A2)) {
                System.out.println(2);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
