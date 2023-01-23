package Context;

import java.util.Scanner;

public class Lets_Buy_Toys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int i=0, j=n-1;
        int maxToys=0;
        int markHap=arr[i];
        int jackHap=arr[j];
        while(i<j){
            if(markHap==jackHap){
                maxToys=i+1+n-j;
                i++;
                j--;
                markHap+=arr[i];
                jackHap+=arr[j];
            } else if (markHap<jackHap) {
                i++;
                markHap+=arr[i];
            }else {
                j--;
                jackHap+=arr[j];
            }
        }
        System.out.println(maxToys);
    }
}
