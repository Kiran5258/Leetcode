class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")){
            return true;
        }
         String b = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left=0;int right=b.length()-1;
        while(left<right){
            if (b.charAt(left) != b.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}