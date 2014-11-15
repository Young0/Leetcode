public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] zeroRow = new boolean[matrix.length];
        boolean[] zeroCol = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            if(zeroRow[i]){
                setRowZero(matrix,i);
            }
        }
        for(int j = 0; j < matrix[0].length; j++){
            if(zeroCol[j]){
                setColZero(matrix,j);
            }
        }
    }
    private static void setRowZero(int[][] matrix, int a){
        for(int i = 0; i < matrix[0].length; i++){
            matrix[a][i] = 0;
        }
    }
    private static void setColZero(int[][] matrix, int b){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][b] = 0;
        }
    }
}
