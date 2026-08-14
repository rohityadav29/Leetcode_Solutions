class Solution {
    public List<Integer> majorityElement(int[] nums) {

        ArrayList<Integer> list =new ArrayList<>();
        Map<Integer,Integer> mapp= new HashMap<>();
        for( int i=0;i<nums.length;i++){
            mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);

        }

        for(Map.Entry<Integer,Integer> it: mapp.entrySet()){
            if(it.getValue()>nums.length/3){
     list.add(it.getKey());
            }
        }
        
return list ;
    
    }
}