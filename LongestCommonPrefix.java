package com.dubey.leetcode;

/**
 * Given an array of strings strs, return the longest common prefix among all the strings.
 * <p>
 * If there is no common prefix, return an empty string <code>""</code>.
 * </p><p>
 * Example 1:
 * </p><p>
 * Input: <code>strs = ["bat","bag","bank","band"]</code>
 * </p><p>
 * Output: <code>"ba"</code>
 * </p><p>
 * Example 2:
 * </p><p>
 * Input: <code>strs = ["dance","dag","danger","damage"]</code>
 * </p><p>
 * Output: <code>"da"</code>
 * </p><p>
 * Example 3:
 * </p><p>
 * Input: <code>strs = ["neet","feet"]</code>
 * </p><p>
 * Output: <code>""</code>
 * </p>
 * <p>
 * Constraints:
 * </p>
 * <ul>
 *   <li>1 &lt;= strs.length &lt;= 200</li>
 *   <li>0 &lt;= strs[i].length &lt;= 200</li>
 *   <li>strs[i] consists of lowercase English letters if non-empty</li>
 * </ul>
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"bat", "bag", "bank", "band"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix))  {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
            }
        }
            }
        return prefix;
    }
}
