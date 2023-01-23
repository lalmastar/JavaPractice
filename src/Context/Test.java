package Context;
import java.util.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='1' || str.charAt(i)=='3' || str.charAt(i)=='5' || str.charAt(i)=='7' || str.charAt(i)=='9'){
                count++;
            }
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
