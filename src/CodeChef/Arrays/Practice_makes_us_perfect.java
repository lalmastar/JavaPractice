package CodeChef.Arrays;
import java.io.*;
public class Practice_makes_us_perfect {
    public static void atLeast10_1(int p1, int p2, int p3, int p4){
        int count = 0;
        if(p1 >= 10){
            count++;
        }
        if(p2 >= 10){
            count++;
        }
        if(p3 >= 10){
            count++;
        }
        if(p4 >= 10){
            count++;
        }
        System.out.println(count);
    }
    public static void atLeast10_2(String[] str){
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            int temp = Integer.parseInt(str[i]);
            if(temp >= 10){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int p1 = Integer.parseInt(str[0]);
        int p2 = Integer.parseInt(str[1]);
        int p3 = Integer.parseInt(str[2]);
        int p4 = Integer.parseInt(str[3]);
        atLeast10_1(p1,p2,p3,p4);
        atLeast10_2(str);
    }
}
