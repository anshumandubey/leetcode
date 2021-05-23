package com.dubey.leetcode;

import java.util.*;

public class ThreeSum {
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> res = new HashSet<List<Integer>>();

            List<Integer> n = new ArrayList<Integer>();
            List<Integer> z = new ArrayList<Integer>();
            List<Integer> p = new ArrayList<Integer>();

            for (Integer num : nums) {
                if (num < 0) {
                    n.add(num);
                } else if (num == 0) {
                    z.add(num);
                } else {
                    p.add(num);
                }
            }

            Set<Integer> N = new HashSet<Integer>(n);
            Set<Integer> P = new HashSet<Integer>(p);

            for (int i = 0; i < p.size(); i++) {
                if (!z.isEmpty()) {
                    if (N.contains(-1 * p.get(i))) {
                        res.add(Arrays.asList(-1 * p.get(i), 0, p.get(i)));
                    }
                }

                for (int j = i + 1; j < p.size(); j++) {
                    if (N.contains((p.get(i) + p.get(j)) * -1)) {
                        List<Integer> result = Arrays.asList(p.get(i), p.get(j), (p.get(i) + p.get(j)) * -1);
                        Collections.sort(result);
                        res.add(result);
                    }
                }
            }

            for (int i = 0; i < n.size(); i++) {
                for (int j = i + 1; j < n.size(); j++) {
                    if (P.contains((n.get(i) + n.get(j)) * -1)) {
                        List<Integer> result = Arrays.asList(((n.get(i) + n.get(j)) * -1), n.get(i), n.get(j));
                        Collections.sort(result);
                        res.add(result);
                    }
                }
            }

            if (z.size() > 2) {
                res.add(Arrays.asList(0, 0, 0));
            }

            return new ArrayList<List<Integer>>(res);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(new Solution().threeSum(nums));
    }
}
