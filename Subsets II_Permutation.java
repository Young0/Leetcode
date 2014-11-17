public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if( S.length == 0 || S == null) return res;
        Arrays.sort(S);
        ArrayList<Integer> item = new ArrayList<Integer>();
        res.add(item);
        helper(S,res,item,0);
        return res;
    }
    public void helper(int[] S, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, int pos) {
        for(int i = pos; i < S.length; i++) {
            if(i > pos && S[i] == S[i-1]){
                continue;
            } else {
                item.add(S[i]);
                res.add(new ArrayList<Integer>(item));
                helper(S,res,item,i+1);
                item.remove(item.size()-1);
            }
        }
    }
}
