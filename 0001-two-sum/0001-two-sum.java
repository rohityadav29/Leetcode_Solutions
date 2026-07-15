// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int r=0;
//        int  j=0;
//         int output[]=new int[2];
//         for(int i=0;i<n;i++){
// output[j]=i;
// j++;
//        r=r+nums[i];
// if( r==target)
// break;
//         }
//         return output;
//     }
// }

class Solution{
    public int[]twoSum(int[]nums,int target){
        int r=0;
        int n=nums.length;
        int output[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 r=nums[i]+nums[j];
            if(r==target){
                 output[0]=i;
                 output[1]=j;
            break; 
            }
        }
            }
        return output;

    }
}