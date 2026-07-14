class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int leftSum[]=new int[n];
        int rightSum[]=new int[n];
         int  answer[]=new int[n];
        int r=0;
        for(int i=0;i<nums.length;i++){
leftSum[i]=r;;
  r+=nums[i];
        }
             r=0;
        for( int i=n-1;i>=0;i--){
            rightSum[i]=r;
            r=r+nums[i]  ;
        }

        for (int i=0;i<n;i++){
         answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
      return answer;

    }
}