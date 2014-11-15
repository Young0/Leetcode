import java.lang.Math;

public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int sum[] = new int[n];
        sum[0] = grid[0][0];
        for(int i = 1; i < n; i++){
            sum[i] = sum[i - 1] + grid[0][i];
        }
        for(int i = 1; i < m; i++){
            sum[0] += grid[i][0];
            for(int j = 1; j < n; j++){
                sum[j] = Math.min(sum[j], sum[j-1]) + grid[i][j];
            }
        }
        return sum[n-1];
    }
}
