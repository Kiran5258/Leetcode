class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>result=new ArrayList<>();
        int row=0,rowend=arr.length-1;
        int col=0,colend=arr[0].length-1;
        while(row<=rowend && col<=colend){
            for(int i=col;i<=colend;i++)result.add(arr[row][i]);
            row++;
            for(int i=row;i<=rowend;i++)result.add(arr[i][colend]);
            colend--;
            if(row<=rowend){
                for(int i=colend;i>=col;i--)result.add(arr[rowend][i]);
                rowend--;
            }
            if(col<=colend){
                for(int i=rowend;i>=row;i--)result.add(arr[i][col]);
                col++;
            }

        }
        return result;
    }
}