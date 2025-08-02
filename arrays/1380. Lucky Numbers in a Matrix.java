class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
       List<Integer>row=new ArrayList<>();
       List<Integer>column=new ArrayList<>();
       for(int i=0;i<matrix.length;i++){
           int min=Integer.MAX_VALUE;
           for(int j=0;j<matrix[i].length;j++){
               if(min>matrix[i][j]){
                   min=matrix[i][j];
               }
           }
           column.add(min);
       }
       for(int i=0;i<matrix[0].length;i++){
           int max=Integer.MIN_VALUE;
            System.out.println(i);
           for(int j=0;j<matrix.length;j++){
               System.out.println(j);
               if(max<matrix[j][i]){
                   max=matrix[j][i];
               }
           }
           row.add(max);
       }
        List<Integer> result = new ArrayList<>();
        for (int num : row) {
            if (column.contains(num)) {
                result.add(num);
            }
        }
       return result;
    }
}