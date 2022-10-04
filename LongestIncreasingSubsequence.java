public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] t = new int[nums.length];
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = Arrays.binarySearch(t, 0, len, nums[i]);
            if (index < 0) {
                index = -(index + 1);
            }
            t[index] = nums[i];
            if (index == len) {
                len++;
            }
        }
        return len;
    }
}
