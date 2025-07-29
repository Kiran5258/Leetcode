class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][]newimage=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            int k=0;
            for(int j=image[i].length-1;j>=0;j--){
                newimage[i][k] = image[i][j] == 0 ? 1 : 0;
                k++;
            }
        }
        return newimage;
    }
}