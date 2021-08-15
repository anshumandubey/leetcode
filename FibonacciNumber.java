package com.dubey.leetcode;

public class FibonacciNumber {
    static class Solution {
        public int fib(int n) {
            if (n==0 || n==1 ) {
                return n;
            }
            int a = 0;
            int b = 1;
            int res = 0;
            while (--n > 0) {
                res = a+b;
                a = b;
                b = res;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fib(2));
    }
}
