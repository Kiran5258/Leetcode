class Solution {
    public String truncateSentence(String s, int k) {
        String[]arr=s.split(" ");
        String str="";
        if(k==arr.length)return s;
        for(int i=0;i<k;i++){
            str+=arr[i];
            if(i!=k-1)str+=" ";
        }
        return str;
    }
}