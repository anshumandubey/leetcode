package com.dubey.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {
    static class Solution {
        public int reverse(int x) {
            // It could be solved with conversion to string too but I'm assuming we can't use other data type
            int res = 0;
            int absX = Math.abs(x);
            while (absX > 0) {
                if (res > 214748364) {
                    res = 0;
                    break;
                }
                res = (res * 10) + (absX % 10);
                System.out.println(res);
                absX = absX / 10;
            }

            if (x < 0) {
                return (0 - res);
            }

            return res;
        }
    }

    public static void main(String[] args) {
        int value = 1534236469;
        System.out.println(new Solution().reverse(value));
    }
}
