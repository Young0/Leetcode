public class Solution {
    public int uniquePaths(int m, int n) {
        if (m < 0 || n < 0){
            return 0;
        }
        if (m == 0 || n == 0 ){
            return 1;
        }
        int[] step = new int[n];
        step[0] = 1;
        for(int i = 0; i < m;i++){
            for(int j = 1; j < n; j++){
                step[j] += step[j - 1];
            }
        }
        return step[n-1];
    }
}
