class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mapp= new HashMap<>();
        for( int i=0;i<nums.length;i++){
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);

        }

        for(Map.Entry<Integer,Integer> it: mapp.entrySet()){
            if(it.getValue()>nums.length/2){
 return it.getKey();
            }
        }
        
return-1;
    }
}