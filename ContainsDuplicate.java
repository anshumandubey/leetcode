package com.dubey.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
            return nums.length != numSet.size();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(new Solution().containsDuplicate(nums));
    }
}
