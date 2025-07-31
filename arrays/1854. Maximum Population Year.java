class Solution {
    public int maximumPopulation(int[][] logs) {
        int[]arr=new int[2051];
        for(int i=0;i<logs.length;i++){
            arr[logs[i][0]]++;
            arr[logs[i][1]]--;
        }
        int maxpopulation=arr[1950],year=1950;
        for(int i=1951;i<2051;i++){
            arr[i]+=arr[i-1];
            if(maxpopulation<arr[i]){
                maxpopulation=arr[i];
                year=i;
            }
        }
        return year;
    }
}