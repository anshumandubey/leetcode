public class Solution {
    public int firstUniqChar(String s) {
            char[] chars = s.toCharArray();
            Map<Character, Long> frMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
            for (int i = 0; i < chars.length; i++) {
                if (frMap.get(chars[i]) == 1) {
                    return i;
                }
            }
            return -1;
        }
}
