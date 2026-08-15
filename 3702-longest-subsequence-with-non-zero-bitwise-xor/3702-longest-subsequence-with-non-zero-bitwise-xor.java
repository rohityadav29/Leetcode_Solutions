class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;  
    //    int count =0;
    boolean hasNonZero = false;
        for(int i=0;i<nums.length;i++){
xor= xor^nums[i];
if( nums[i]!=0){
 hasNonZero= true;
}
        }

  if( hasNonZero==false) return 0;
if( xor==0) return nums.length-1;
 else  return nums.length;
}
       
 
    }
