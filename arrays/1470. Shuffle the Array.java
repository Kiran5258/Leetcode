class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]ans=new int[2*n];
        for(int i=0;i<n;i+=2){
            ans[i]=nums[i/2];
            ans[i+1]=nums[n++];
        }
        return ans;
    }
}