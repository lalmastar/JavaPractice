package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean anagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result=Arrays.equals(arr1, arr2);
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        A.toLowerCase();
        B.toLowerCase();
        System.out.println((anagram(A,B))?"Anagrams":"Not Anagrams");
    }
}
