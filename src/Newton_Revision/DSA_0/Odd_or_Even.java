package Newton_Revision.DSA_0;

import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
