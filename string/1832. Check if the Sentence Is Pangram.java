class Solution {
    public boolean checkIfPangram(String sentence) {
       char[]alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m', 'n','o','p','q','r','s','t','u','v','w','x','y','z'};
       int count=0;
       for(int i=0;i<26;i++){
       if( sentence.contains(String.valueOf(alpha[i])))count++;
       }
       if(count==26)return true;
       return false;

    }
}