package com.dubey.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntersectionTwoArray {
    static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            List<Integer> res = new ArrayList<Integer>();
            Map<Integer, Long> frequencyMap =
                    Arrays.stream(nums1.length > nums2.length ? nums1 : nums2).boxed().
                            collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            for (int num : nums1.length > nums2.length ? nums2 : nums1) {
                if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                    res.add(num);
                    frequencyMap.put(num, frequencyMap.get(num) - 1);
                }
            }
            return res.stream().mapToInt(i -> i).toArray();
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(new Solution().intersect(nums1, nums2)));
    }
}
