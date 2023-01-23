package HackerRank;

import java.io.*;
import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String str = String.valueOf(bufferedReader.read());
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String rev = "";
        int len = str.length();
        for (int i = len-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(str.equals(rev)?"Yes":"No");
    }
}
