package com.dubey.leetcode;

import java.util.Arrays;

public class ReverseString {
    static class Solution {
        public void reverseString(char[] s) {
            int start = 0, end = s.length - 1;
            while (start < end) {
                char temp;
                temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        new Solution().reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
