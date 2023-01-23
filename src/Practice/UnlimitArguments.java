package Practice;

public class UnlimitArguments {
    private static int add(int a,int ...val) {
        int sum=0;
        for (int i = 0; i < val.length; i++) {
            sum+=val[i];
        }
        return sum+a;
    }
    public static void main(String[] args) {
        System.out.println(add(3,4,3,5,5));
    }


}
