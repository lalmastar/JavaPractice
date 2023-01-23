package CodeChef.One_to_Two;
import java.io.*;
public class Chef_and_Stock_Prices {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int s = Integer.parseInt(str[0]);
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            float c = Float.parseFloat(str[3]);
            float p = s*(c/100);
            float changePrice = (s + p);
            if(changePrice >= a && changePrice <= b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
