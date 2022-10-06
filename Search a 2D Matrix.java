class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i,s,e,j,m,a;
        int t = target;
        for(i=0; i<matrix.length ;i++)
        {
            a = matrix[i].length;
            s = 0;
            e = a -1;
              while(s<=e)
    { 
        m=s+(e-s)/2;
        if(t<matrix[i][m])
          e=m-1;
        else if(t>matrix[i][m])
          s=m+1;
        else
          return true;
    }  
        }
        return false ; 
    }
}
