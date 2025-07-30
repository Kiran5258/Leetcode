class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][]transmat=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transmat[j][i]=matrix[i][j];
            }
        }
        return transmat;
    }
}