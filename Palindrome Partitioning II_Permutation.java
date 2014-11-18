//There are two ways to check Palindrome, one is using recursion
//the other is iterate all the center point then expand to both sides

// Recursion way O(n^2) time and O(n^2) space
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


//O(n^2) time and O(n) space but much quicker artually
public int minCut(String s) {
        if(s.length()==0)return 0;
        int[]c=new int[s.length()+1];
        for(int i=0;i<s.length();i++)c[i]=Integer.MAX_VALUE;
        c[s.length()]=-1;
        for(int i=s.length()-1;i>=0;i--){
            for(int a=i,b=i;a>=0 && b<s.length() && s.charAt(a)==s.charAt(b);a--,b++) c[a]=Math.min(c[a],1+c[b+1]);
            for(int a=i,b=i+1;a>=0 && b<s.length() && s.charAt(a)==s.charAt(b);a--,b++) c[a]=Math.min(c[a],1+c[b+1]);
        }
        return c[0];
    }
