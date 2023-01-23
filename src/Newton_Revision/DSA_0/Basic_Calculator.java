package Newton_Revision.DSA_0;

import java.util.Scanner;

public class Basic_Calculator {
    public static int calculator(char ch, int a, int b){
        switch (ch){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(calculator(ch, a, b));
    }
}
