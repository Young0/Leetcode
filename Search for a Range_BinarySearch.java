public class Solution {
    public int[] searchRange(int[] A, int target) {
        int[] res = {-1,-1};
        if (A.length == 0 || target < A[0] || target > A[A.length-1]) {
            return res;
        }
        int l = 0;
        int r = A.length-1;
        while (l < r) {
            int m = l + (r - l)/2;
            if(A[m] < target) {
                l = m+1;
            }else{
                r = m;
            }
        }
        int lower = 0;
        if (A[l] != target) {
            return res;
        } else {
            lower = l;
        }
        l = 0;
        r = A.length - 1;
        while (l < r) {
            int m = l + (r - l)/2;
            if(A[m] < target+1) {
                l = m+1;
            } else { 
                r = m;
            }
        }
        int upper = 0;
        if (A[l] != target) {
            upper = l-1;
        } else {
            upper = l;
        }
        res[0] = lower;
        res[1] = upper;
        return res;
    }
}
