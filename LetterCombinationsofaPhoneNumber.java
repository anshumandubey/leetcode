package com.dubey.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

    public static void main(String[] args) {
        List<String> inputs = List.of("23", "2");
        for (String input : inputs) {
            System.out.println(new LetterCombinationsofaPhoneNumber().letterCombinations(input));
        }
    }

    public List<String> letterCombinations(String digits) {
        // Mapping of digits to corresponding letters
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        backtrack(result, map, digits, 0, new StringBuilder());
        return result;
    }

    // Helper function for backtracking
    private void backtrack(List<String> result, String[] map, String digits, int index, StringBuilder current) {
        // If the current combination is the same length as digits, add to result
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        // Get the letters for the current digit
        String letters = map[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c); // Add letter
            backtrack(result, map, digits, index + 1, current); // Move to next digit
            current.deleteCharAt(current.length() - 1); // Remove letter (backtrack)
        }
    }
}
