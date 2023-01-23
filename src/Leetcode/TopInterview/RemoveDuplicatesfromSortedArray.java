package Leetcode.TopInterview;

import java.util.*;

public class RemoveDuplicatesfromSortedArray {
    public static void removeDuplicate(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    public static int removeDuplicate1(int[] nums) {
        int slow = 0;
        int fast = 0;
        for (int i = 1; i < nums.length; i++) {
            fast = i;
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
    public static void main(String[] args) {
//        int[] arr={1,1,2};
        int[] nums={0,0,1,1,1,2,2,3,3,4};
//        removeDuplicate(arr);
        System.out.println(removeDuplicate1(nums));
    }
}
