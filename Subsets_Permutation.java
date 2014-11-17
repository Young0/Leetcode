public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> item = new ArrayList<Integer>();
        res.add(item);
        if(S == null || S.length == 0) return res;
        Arrays.sort(S);
        helper(S,res,item,0);
        return res;
    }
    private void helper(int[] S, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, int pos){
        for(int i = pos; i < S.length; i++) {
            item.add(S[i]);
            res.add(new ArrayList<Integer>(item));
            helper(S, res, item, i+1);
            item.remove(item.size() - 1);
        }
    }
}
        
