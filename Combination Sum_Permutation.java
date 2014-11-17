public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(candidates == null || candidates.length == 0) return res;
        Arrays.sort(candidates);
        ArrayList<Integer> item = new ArrayList<Integer>();
        if(candidates == null || candidates.length == 0) return res;
        helper(candidates, target, res, item, 0);
        return res;
    }
    public void helper(int[] candidates, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, int pos) {
        if(target < 0) return;
        if(target == 0) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = pos; i < candidates.length; i++) {
            if(i > 0 && candidates[i] == candidates[i-1]){
                continue;
            }
            item.add(candidates[i]);
            helper(candidates, target - candidates[i], res, item, i);
            item.remove(item.size()-1);
        }
    }
}
