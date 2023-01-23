package Leetcode.Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i && nums[i] <= nums.length - 1) {
                swap(nums, i, nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}
