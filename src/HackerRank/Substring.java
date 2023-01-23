package HackerRank;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println(S.substring(start,end));
    }
}
