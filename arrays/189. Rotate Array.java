class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        rotates(nums,0,n-1);
        rotates(nums,0,k-1);
        rotates(nums,k,n-1);
        
    }
    public static void rotates(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}