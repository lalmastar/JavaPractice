package CodeChef;

import java.io.*;;

public class Sum_of_Digits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int sum = 0;
            while(n > 0){
                int temp = n%10;
                sum += temp;
                n/=10;
            }
            System.out.println(sum);
        }
    }
}
