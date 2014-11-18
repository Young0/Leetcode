import java.lang.Math;

public class Solution {
    public int minCut(String s) {
        if(s.length() == 0 || s == null) return 0;
        int len = s.length();
        int[] cut = new int[len+1];
        for(int i = 0; i <= len ; i++){
            cut[i] = len - i;
        }
        boolean[][] isPalin = new boolean[len][len];
        for(int i = 0; i < len; i++) {  
            for(int j = 0; j < len; j++) {  
                isPalin[i][j] = false;
            }
        }
        for(int i = len - 1; i >= 0; i--){
            for(int j = i; j < len; j++){
                if(s.charAt(i) == s.charAt(j) && (j - i < 2 || isPalin[i+1][j-1])){
                    isPalin[i][j] = true;
                    cut[i] = Math.min(cut[i], cut[j+1]+1);
                }
            }
        }
        return cut[0]-1;
    }
}
