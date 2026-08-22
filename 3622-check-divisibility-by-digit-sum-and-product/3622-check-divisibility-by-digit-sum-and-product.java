 class Solution {
    public boolean checkDivisibility(int n) {
     int dup=n;
        int sum =0;
        int pro=1;
        while ( dup>0){
             int last= dup%10;
            dup=dup/10;
             sum=sum+last;
            pro=pro*last;
        }
        if(n%(sum+pro)==0){
            return true;
        }
        else return false;
    }
}