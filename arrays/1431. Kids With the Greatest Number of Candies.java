class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        List<Boolean>kids=new ArrayList<>();
        int i=1;
        while(i!=candies.length){
            if(candies[i]>max){
                max=candies[i];
            }
            i++;
        }
          for (int j = 0; j < candies.length; j++) {
            if (candies[j] + extraCandies >= max) {
                kids.add(true);
            } else {
                kids.add(false);
            }
        }

        return kids;
    }
}