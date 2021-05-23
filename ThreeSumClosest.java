package com.dubey.leetcode;

public class ThreeSumClosest {
    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int closest = 0;
            int distance = 100000;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        int sum = nums[i] + nums[j] + nums[k];
                        int difference = Math.abs(target - sum);
                        if (difference < distance) {
                            distance = difference;
                            closest = sum;
                        }
                    }
                }
            }
            return closest;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(new Solution().threeSumClosest(nums, target));
    }
}
