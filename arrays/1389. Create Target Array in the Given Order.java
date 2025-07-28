class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[]target=new int[nums.length];
        int size=0;
        for(int i=0;i<nums.length;i++){
            int insertpos=index[i];
            for(int j=size;j>insertpos;j--)target[j]=target[j-1];
            target[insertpos]=nums[i];
            size++;
        }
        return target;
    }
}