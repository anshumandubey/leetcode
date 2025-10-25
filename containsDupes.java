package com.dubey.leetcode;

import java.util.HashSet;

class ContainsDupes {
    public boolean containsDuplicate(int[] nums) {
        
      HashSet<Integer> set = new HashSet<Integer>();
for(int i:nums){
      
	  if(set.contains(i)){ return true; }
	  
        set.add(i);   
    }
    return false;
	}
    
}
