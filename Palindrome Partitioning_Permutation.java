public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        if(s.length() == 0 || s == null) return null;
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        ArrayList<String> cur = new ArrayList<String>();
        getRes(s,0,res,cur);
        return res;
    }
    
    public void getRes(String s,int pos,ArrayList<ArrayList<String>> res,ArrayList<String> cur){
        if(pos == s.length()){
            ArrayList<String> temp = new ArrayList<String>(cur);
            res.add(temp);
            return;
        }
        for(int i = pos + 1;i <= s.length();i++){
            String str = s.substring(pos,i);
            if(isPalin(str)){
                cur.add(str);
                getRes(s,i,res,cur);
                cur.remove(cur.size() - 1);
            }
        }
    }
    
    public boolean isPalin(String str){
        int l = 0;
        int r = str.length() - 1;
        while(l < r){
            if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
        
