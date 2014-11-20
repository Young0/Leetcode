public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<String>();
        if(digits.length() == 0 || digits == null) {
            res.add("");
            return res;
        }
        HashMap<Character, char[]> map = new HashMap<Character, char[]>();
        map.put('0', new char[] {});
        map.put('1', new char[] {});
        map.put('2', new char[] { 'a', 'b', 'c' });
        map.put('3', new char[] { 'd', 'e', 'f' });
        map.put('4', new char[] { 'g', 'h', 'i' });
        map.put('5', new char[] { 'j', 'k', 'l' });
        map.put('6', new char[] { 'm', 'n', 'o' });
        map.put('7', new char[] { 'p', 'q', 'r', 's' });
        map.put('8', new char[] { 't', 'u', 'v'});
        map.put('9', new char[] { 'w', 'x', 'y', 'z' });
        StringBuilder sb = new StringBuilder();
        helper(digits,res,sb,map);
        return res;
    }
    public void helper(String digits, ArrayList<String> res, StringBuilder sb, HashMap<Character, char[]> map) {
        if(sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }
        for(char c : map.get(digits.charAt(sb.length()))) {
            sb.append(c);
            helper(digits,res,sb,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
}
