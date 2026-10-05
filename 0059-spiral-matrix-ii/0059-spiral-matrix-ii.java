class Solution {
    public int[][] generateMatrix(int n) {
       int spi[][]=new int [n][n];
     //  List<Integer>list=new ArrayList<>();
        int left =0;
        int right = n-1;
        int top=0;
        int bottom=n-1;
        int num=1;
        while(left<=right&& top<=bottom ){
        for( int i=left;i<=right;i++){
          spi[top][ i]= num ;
          num=num+1;
        }
        top++;
         for( int i=top;i<=bottom;i++){
          spi[i][right]= num;
          num+=1;
        }
        right--;
if( top<=bottom){
          for( int i=right;i>=left;i--){
             spi[bottom][i]=num;
             num+=1;
        }
        bottom--;
}
        if(left<=right){
          for( int i=bottom;i>=top;i--){
             spi[i][left]=num;
             num+=1;
          }
        
        left++;
        }
        }
return spi;

    }
}
   