package com.dubey.leetcode;

import java.util.Arrays;

public class RotateArray {
    static class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            if (nums == null || nums.length < 2 || k == 0) {
                return;
            }

            reverse(nums, 0, nums.length - k - 1);
            reverse(nums, nums.length - k, nums.length - 1);
            reverse(nums, 0, nums.length - 1);
        }

        private void reverse(int[] nums, int i, int j) {
            int temp = 0;
            while (i < j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new Solution().rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
