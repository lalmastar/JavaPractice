package HackerRank;

import java.util.Scanner;

public class Strings_Introduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

    }
}
