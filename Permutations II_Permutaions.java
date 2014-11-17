public class Solution { 
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> item = new ArrayList<Integer>();
        if(num == null || num.length == 0) return res;
        int[] visited = new int[num.length];
        Arrays.sort(num);
        helper(num,res,item,visited);
        return res;
    }
    public void helper(int[] num, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> item, int[] visited){
        if(item.size() == num.length) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i = 0; i < num.length; i++) {
            if(visited[i] == 1 || (i != 0 && num[i] == num[i - 1] && visited[i - 1] == 0)){
                continue;
            }
            visited[i] = 1;
            item.add(num[i]);
            helper(num,res,item,visited);
            item.remove(item.size()-1);
            visited[i] = 0;
        }
    }
}
