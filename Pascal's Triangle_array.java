public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> item = new ArrayList<Integer>();
            item.add(1);
            if(i > 0){
                 for(int j = 1; j < res.get(i-1).size(); j++){
                    item.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }   
                item.add(1);
            }
            res.add(item);
        }
        return res;
    }
}   
