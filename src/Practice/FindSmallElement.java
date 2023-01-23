package Practice;

public class FindSmallElement {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,4,3,9};
        int minIdx=arr[0];
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if((min>arr[i]) && (minIdx>arr[i])){
                minIdx=arr[i];
            }
        }
        System.out.println(minIdx);

    }
}
