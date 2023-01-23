package HackerRank;

import java.util.Scanner;

public class Static_Initializer_Block {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int h = input.nextInt();
        if(b>0 && h>0){
            System.out.println(b*h);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
