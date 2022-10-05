/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        if(n==0 || nums==null)  return null;
        return recursiveHelper(nums,0,n-1);
    }
    public TreeNode recursiveHelper(int[] nums,int l, int r) {
        if(l>r) return null;
        int m=(l+r)/2;
        TreeNode head= new TreeNode(nums[m]);
        head.left=recursiveHelper(nums,l,m-1);
        head.right=recursiveHelper(nums,m+1,r);
        return head;
    }
}
