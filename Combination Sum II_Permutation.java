public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num == null || num.length == 0) return res;
        Arrays.sort(num);
        ArrayList<Integer> item = new ArrayList<Integer>();
        helper(res, item, 0, num, target);
        return res;
    }
    public void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, int pos, int[] num, int target){
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = pos;i < num.length;i++){  
            if(i > pos && num[i] == num[i-1]) continue;  
            item.add(num[i]);  
            helper(res, item, i + 1, num, target - num[i]);  
            item.remove(item.size()-1); 
        }
    }
}
