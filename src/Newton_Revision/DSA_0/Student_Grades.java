package Newton_Revision.DSA_0;

import java.util.Scanner;

public class Student_Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int marks = a+b+c+d+e;

        if(marks >= 80){
            System.out.println("A");
        } else if (marks<80 && marks>=60) {
            System.out.println("B");
        }
        else if (marks<60 && marks>=40) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}
