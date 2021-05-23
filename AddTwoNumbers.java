package com.dubey.leetcode;

public class AddTwoNumbers {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode previous = new ListNode(0);
            ListNode res = previous;
            int carry = 0;
            int sum = 0;
            while (l1 != null || l2 != null || carry != 0) {
                ListNode current = l1 != null ? l1 : (l2 != null ? l2 : (new ListNode(0)));
                sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
                current.val = sum % 10;
                carry = sum / 10;
                previous.next = current;
                previous = current;

                l1 = (l1 == null) ? l1 : l1.next;
                l2 = (l2 == null) ? l2 : l2.next;
            }

            return res.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode sol = new Solution().addTwoNumbers(l1, l2);
        System.out.println("#############");
        while (sol != null) {
            System.out.println(sol.val);
            sol = sol.next;
        }
    }
}
