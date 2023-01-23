package Leetcode.TopInterview;

public class PowerOfThree {
    public static boolean powerOfThree1(int n){
        if(n==0){
            return true;
        }
        for (int i = 0; i <n ; i++) {
            int res=(int) Math.pow(3,i);
            if(res==n){
                return true;
            }
        }
        return false;

    }
    public static boolean powerOfThree2(int n){
        return n > 0 && (1162261467 % n==0);
    }
    public static void main(String[] args) {
        int n=2;
//        System.out.println(powerOfThree1(n));
        System.out.println(powerOfThree2(n));

    }

}
