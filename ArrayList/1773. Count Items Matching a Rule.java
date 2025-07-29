class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String[]rule={"type","color","name"};
        int count=0,index=0;
        for(int i=0;i<3;i++){
            if(ruleKey.equals(rule[i])){
                   index=i;
            }
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(index).contains(ruleValue) && items.get(i).get(index).length()==ruleValue.length()){
                ++count;
            }
        }
        return count;
    }
}