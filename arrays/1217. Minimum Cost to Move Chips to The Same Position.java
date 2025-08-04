class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddcost=0;
        int evencost=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0)evencost++;
            else oddcost++;
        }
        return Math.min(evencost,oddcost);
    }
}