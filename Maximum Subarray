//keep tracking local max and global max

import java.lang.Math;

public class Solution {
    public int maxSubArray(int[] A) {
        if(A.length == 0 || A == null)
        {
            return 0;
        }
        int max = A[0];
        int cur = A[0];
        for(int i = 1; i < A.length; i++)
        {
            cur = Math.max(A[i], cur+A[i]);
            max = Math.max(max, cur);
        }
        return max;
    }
}
