//try to use binary search
public class Solution {
    public int searchInsert(int[] A, int target) {
       if(A.length == 0 || A == null) return 0;
       int l = 0;
       int r = A.length - 1;
       while(l <= r)
       {
            int m = l + (r - l)/2;
            if(target == A[m])
            {
                return m;
            }else if(target > A[m]){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return l;
    }
}
