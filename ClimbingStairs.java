package com.dubey.leetcode;

public class ClimbingStairs {
    static class Solution {
        public int climbStairs(int n) {
            if (n==0 || n==1 || n==2) {
                return n;
            }
            int a = 1;
            int b = 2;
            int res = 0;
            while (n-- > 2) {
                res = a+b;
                a = b;
                b = res;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(45));
    }
}
