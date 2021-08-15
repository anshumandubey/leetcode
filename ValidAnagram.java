package com.dubey.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram {
    static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            Map<Character, Long> frMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
            for (char c : t.toCharArray()) {
                if (frMap.containsKey(c)) {
                    Long val = frMap.get(c);
                    frMap.put(c, val - 1);
                    if (frMap.get(c) < 0) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        System.out.println(new Solution().isAnagram(s, t));
    }
}
