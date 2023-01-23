package DSA.Searching;

public class LinearSearch {
    public static int linearSearch1(int[] arr, int size, int target){
        if(size == 0){
            return -1;
        } else if (arr[size - 1] == target) {
            return size-1;
        }else{
            return linearSearch1(arr, size-1, target);
        }
    }
    public static int linearSearch2(int[] arr, int size, int target){
        for (int i = 0; i < size; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 15, 6, 9, 4 };
        int target = 6;
        int n = arr.length;
        int result = linearSearch2(arr,n, target);
        System.out.println("The element found at index: "+result +" value is: "+ arr[result]);
    }
}
