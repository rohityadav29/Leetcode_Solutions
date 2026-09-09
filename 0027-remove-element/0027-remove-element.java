class Solution {
    public int removeElement(int[] nums, int val) {
        int left =0;
        int right=nums.length-1;
        int temp;
        while(left<=right){
            if(nums[left]==val && nums[right]!=val){       
        temp=nums[right];
nums[right]=nums[left];
nums[left]=temp;
left++;
right--;
     }
     else if(nums[left]!=val){
left++; 
}
else{
    right--;
}
        }
        return left ;
    }
}
