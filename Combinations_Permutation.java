public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {  
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> item = new ArrayList<Integer>();
        if(n <= 0 || k > n) return res;
        helper(n,k,res,item,1);
        return res;
    }  
    public void helper(int n, int k, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, int pos) {
        if(item.size() == k) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = pos; i <= n; i ++){
            item.add(i);
            helper(n,k,res,item,i+1);
            item.remove(item.size()-1);
        }
    }
}
