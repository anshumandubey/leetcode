package com.dubey.leetcode;


/**
 * Given {@code head} which is a reference node to a singly-linked list.
 * The value of each node in the linked list is either {@code 0} or {@code 1}.
 * The linked list holds the binary representation of a number.
 * <p>
 * Return the decimal value of the number in the linked list.
 * <p>
 * The most significant bit is at the head of the linked list.
 * <hr>
 * <b>Example 1:</b>
 * <ul>
 *   <li>Input: {@code head = [1,0,1]}</li>
 *   <li>Output: {@code 5}</li>
 *   <li>Explanation: {@code (101)} in base 2 = {@code (5)} in base 10</li>
 * </ul>
 * <b>Example 2:</b>
 * <ul>
 *   <li>Input: {@code head = [0]}</li>
 *   <li>Output: {@code 0}</li>
 * </ul>
 * <hr>
 * <b>Constraints:</b>
 * <ul>
 *   <li>The Linked List is not empty.</li>
 *   <li>Number of nodes will not exceed {@code 30}.</li>
 *   <li>Each node's value is either {@code 0} or {@code 1}.</li>
 * </ul>
 */
public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        int result = getDecimalValue(head);
        System.out.println(result);
    }
    public static int getDecimalValue(ListNode head) {
        int result = 0;
        for (ListNode node = head; node != null; node = node.next) {
            result = (result << 1) | node.value;
        }
        return result;
    }
}



