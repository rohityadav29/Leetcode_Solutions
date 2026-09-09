class Solution {
    public int countCommas(int n) {
         int total=0;
        for(int i=1000;i<=n;i++){
             int dup=i;
              int count =0;
            while(dup>0){ 
                dup=dup/10;
                    count++;  
            }
            if (count>=3) {
total++;  
}
        }
        return total;
    }
}