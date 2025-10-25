package com.dubey.leetcode;

import java.util.HashMap;

public class MinimumRoundstoCompleteAllTasks {
    public static void main(String[] args) {
        int[] tasks = {2,2,3,3,2,4,4,4,4,4};
        System.out.println(new MinimumRoundstoCompleteAllTasks().minimumRounds(tasks));
    }
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            hm.put(tasks[i],hm.getOrDefault(tasks[i],0)+1);
        }
        int count = 0;
        for(int i: hm.values()){
            if(i==1) return -1;
            count+= i/3;
            if(i%3!=0) count++;
        }
        return count;
    }
}
