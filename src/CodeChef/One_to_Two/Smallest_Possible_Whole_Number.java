package CodeChef.One_to_Two;
import java.io.*;
public class Smallest_Possible_Whole_Number {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
//            while(n>=k){
//                n = n-k;
//            }
//            System.out.println(n);
            System.out.println(n%k);
        }
    }
}
