package DSA.Searching;

public class BinarySearch {
    public static int binarySearch1(int[] arr, int left, int right, int target){
    //        Java implementation of recursive Binary Search
    //        Time Complexity: O(log n)
    //        Auxiliary Space: O(log n)

        if(right>=left){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                return binarySearch1(arr, left, mid-1, target);
            }
            return binarySearch1(arr,mid+1, right, target);
        }
        return -1;
    }
    public static int binarySearch2(int[] arr, int left, int right, int target){
//        Java implementation of iterative Binary Search
//        Time Complexity: O(log n)
//        Auxiliary Space: O(1)

        while(right>=left){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 10, 40, 60 };
        int n = arr.length;
        int x = 40;
//        int result = binarySearch1(arr, 0, n - 1, x);
        int result = binarySearch2(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+ result);
    }
}
