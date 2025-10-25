package com.dubey.leetcode;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(new LastStoneWeight().lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i : stones) {
            pq.add(i);
        }
        while (pq.size() > 1) {
            int a = pq.remove();
            int b = pq.remove();
            if (a != b) {
                pq.add(a - b);
            }
        }
        if (pq.isEmpty()) return 0;
        return pq.remove();
    }
}
