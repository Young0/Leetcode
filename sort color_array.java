public class Solution {
    public void sortColors(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int i = 0;
        while(i <= r)
        {
            if(A[i] == 0)
            {
                swap(A,l,i);
                l++;
                i++;
            }else if(A[i] == 1){
                i++;
            }else{
                swap(A,r,i);
                r--;
            }
        }
    }
    public void swap(int[] A,int l,int r){
        int temp = A[l];
        A[l] = A[r];
        A[r] = temp;
    }
}
