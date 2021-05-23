package com.dubey.leetcode;

public class RemoveDuplicatesFromSortedArray {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int unique = nums.length > 0 ? 0 : -1;
            int currIndex = nums.length > 0 ? 1 : 0;
            while (currIndex < nums.length) {
                if (nums[unique] == nums[currIndex]) {
                    currIndex++;
                } else if (nums[unique] != nums[currIndex]) {
                    unique++;
                    nums[unique] = nums[currIndex];
                    currIndex++;
                }
            }
            return unique + 1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = {1, 1, 2};
//        int[] nums = {1, 1};
//        int[] nums = {};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}
