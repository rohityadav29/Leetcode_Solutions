class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mapp= new HashMap<>();
for(int i=0;i<nums.length;i++){
  //  if(mapp.containsKey(nums[i]))
   mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
}

 for(Map.Entry<Integer,Integer> it :  mapp.entrySet()){
    if(it.getValue()>1) return true;
    
 }
 return false;
    }

}