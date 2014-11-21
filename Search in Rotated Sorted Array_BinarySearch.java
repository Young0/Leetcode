public class Solution {
    public int search(int[] A, int target) {
        if (A.length == 0 || A == null) {
            return -1;
        }
        int l = 0;
        int r = A.length-1;
        while (l <= r) {
            int m = l + (r - l)/2;
            if (A[m] == target) {
                return m;
            }
            if (A[m] < A[l]) {
                if (A[m] < target && target <= A[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (A[m] > target && target >= A[l]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return -1;
    }
}
