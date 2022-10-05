package com.dubey.leetcode;

public class MinInRotatedSortedArray {
    static class Solution {
        public int findMin(int[] nums) {
            int start = 0, end = nums.length - 1;
            if (start == end) {
                return nums[start];
            }
            while (start != end - 1) {
                int mid = (start + end) / 2;
                int minVal = min(start, mid, end, nums);
                if (minVal == -1) {
                    end = mid;
                } else if (minVal == 0) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
            return Math.min(nums[start], nums[end]);
        }

        public int min(int start, int mid, int end, int[] nums) {
            if (nums[start] < nums[mid] && nums[start] < nums[end]) {
                return -1;
            } else if (nums[mid] < nums[start] && nums[mid] < nums[end]) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {11, 13, 15, 17};
        System.out.println(new Solution().findMin(nums));
    }
}
