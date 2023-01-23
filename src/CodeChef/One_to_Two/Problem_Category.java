package CodeChef.One_to_Two;
import java.io.*;
public class Problem_Category {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            if(x>=1 && x<100){
                System.out.println("Easy");
            }
            else if(x>=100 && x<200){
                System.out.println("Medium");
            }
            else if(x>=200 && x<=300){
                System.out.println("Hard");
            }
        }
    }
}
