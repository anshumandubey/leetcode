package com.dubey.leetcode;

import java.util.Arrays;

public class CountingBits {
    static class Solution {
        public int[] countBits(int n) {
            int[] res = new int[n+1];
            res[0] = 0;
            int bitsLength = 1;
            for (int i = 1;i <= n; i++) {
                if (bitsLength * 2 == i) {
                    bitsLength = bitsLength *2;
                }
                res[i] = res[i-bitsLength] + 1;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(Arrays.toString(new Solution().countBits(n)));
    }
}
