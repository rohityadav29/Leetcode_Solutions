 


class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
         int temp=0;
        int first=0;
 int end=n-1;
        if( ind==-1){
            while(first<end){
                temp=nums[ first];
                nums[first]=nums[end];
                nums[end]=temp;
                first++;
                end--;
            }
            return;  
        }

       
        for(int i=n-1; i>ind; i--){
            if(nums[ind]<nums[i]){
                temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
           
        }

        int start = ind+1;
       
        while(start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
