package One_One_Session;
import java.util.*;
public class Sort_Zeros_Ones {
    private static void sortBinaryArray(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;
        while (left < right)
        {
            if (arr[left] == 1)
            {
                arr[right] = arr[right] + arr[left];
                arr[left] = arr[right] - arr[left];
                arr[right] = arr[right] - arr[left];
                right--;
            }
            else
            {
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,0,1,1};
        sortBinaryArray(arr);
    }
}
