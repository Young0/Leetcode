public class Solution { 
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> item = new ArrayList<Integer>();
        if(num == null || num.length == 0) return res;
        helper(num,res,item);
        return res;
    }
    public void helper(int[] num, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item){
        if(item.size() == num.length) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = 0; i < num.length; i++) {
            if(item.contains(num[i])){
                continue;
            }
            item.add(num[i]);
            helper(num,res,item);
            item.remove(item.size()-1);
        }
    }
}
