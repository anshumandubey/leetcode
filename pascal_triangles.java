package com.dubey.leetcode;

import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        l1.add(1);
        ans.add(l1);
        
        for(int i=1;i<numRows;i++){
            List<Integer>prevRow=ans.get(i-1);
            List<Integer>curRow=new ArrayList<>();
            curRow.add(1);
            
            for(int j=1;j<i;j++){
                curRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            curRow.add(1);
            ans.add(curRow);
        }return ans;
        
    }
}
