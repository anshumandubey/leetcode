package com.dubey.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOne {
    static class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 1;
            int index = digits.length - 1;
            while (carry > 0 && index >= 0) {
                int temp = digits[index] + carry;
                carry = temp / 10;
                digits[index] = temp % 10;
                index--;
            }
            if (carry > 0) {
                List<Integer> tempList = Arrays.stream(digits).boxed().collect(Collectors.toList());
                tempList.add(0, carry);
                return tempList.stream().mapToInt(Integer::intValue).toArray();
            }
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {4, 9, 9};
        System.out.println(Arrays.toString(new Solution().plusOne(digits)));
    }
}
