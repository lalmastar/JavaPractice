package Practice;

public class EX_OR {
    public static void main(String[] args) {
        int[] arr = {4,5,8,5,4,5,8};
        int n = arr.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
}
