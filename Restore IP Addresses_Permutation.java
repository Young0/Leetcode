public class Solution {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> res = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        if(s.length() < 4 || s.length() > 12) return res;
        helper(s,res,list,0);
        return res;
    }
    public void helper(String s, ArrayList<String> result, ArrayList<String> list, int start) {
        if(list.size() == 4) {
            if(start != s.length())
                return;
            
            StringBuilder sb = new StringBuilder();
            for(String tmp: list) {
                sb.append(tmp);
                sb.append(".");
            }
            sb.deleteCharAt(sb.length()-1);
            result.add(sb.toString());
            return;
        }
        
        for(int i = start; i < s.length() && i <= start+3; i++) {
            String tmp = s.substring(start, i+1);
            if(valid(tmp)) {
                list.add(tmp);
                helper(s, result, list, i+1);
                list.remove(list.size()-1);
            }
        }
    }
    private boolean valid(String str) {
        if (str.length() > 1 && str.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(str);
        if(num < 0 || 255 < num) {
            return false;
        }
        return true;        
    }   
}
