package Practice;
import java.util.*;
public class Anagram {

    public static boolean anagram2(String str1, String str2) {
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

    public static boolean anagram1(char[] arr1, char[] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }

        int[] count=new int[26];

        for(int i=0; i<arr1.length; i++) {
            count[arr1[i]-97]++;
            count[arr2[i]-97]--;
        }
        for(int i=0; i<26; i++) {
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String str1="silent";
        String str2="listen";
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        System.out.println(anagram1(arr1,arr2));
//        System.out.println(anagram2(str1,str2));

    }

}

