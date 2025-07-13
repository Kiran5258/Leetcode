class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length==0)return result;
        int start=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                if(start==i){
                    result.add(String.valueOf(nums[start]));
                }
                else{
                    result.add(nums[start]+"->"+nums[i]);
                }
                start=i+1;
            }
        }
            if(start==nums.length-1){
                result.add(String.valueOf(nums[start]));
            }
            else{
                result.add(nums[start]+"->"+nums[nums.length-1]);
            }
            return result;
        }
    }
