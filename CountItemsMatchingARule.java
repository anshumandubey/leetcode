package com.dubey.leetcode;

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
    static class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            return (int) items.stream().filter(item -> ruleKey.equals("type") ? item.get(0).equals(ruleValue) : ruleKey.equals("color") ? item.get(1).equals(ruleValue) : item.get(2).equals(ruleValue))
                .count();
        }
    }

    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(Arrays.asList("phone", "blue", "pixel"), Arrays.asList("computer", "silver", "lenovo"), Arrays.asList("phone", "gold", "iphone"));
        System.out.println(new Solution().countMatches(items, "color", "silver"));
    }
}
