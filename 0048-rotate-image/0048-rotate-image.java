class Solution {
    public void rotate(int[][] matrix) {
        int temp=0;
        int n= matrix.length;
for( int i=0;i<=n-2;i++){
    for(int j=i+1;j<=n-1;j++){
        temp = matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
}

        for( int i=0;i<n;i++){
              int start =0;
        int end =matrix[i].length-1;

while(start<end){
 temp = matrix[i][start];
  matrix[i][start]=matrix[i][end];
  matrix[i][end] =temp;
start++;
end--;
}


            }
        }

    }
