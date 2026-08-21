class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        int mid = m-1;
        int high= n-1;
 ArrayList<Integer> list=new ArrayList<>();
        while(left<=mid&&right<=high){
            if(nums1[left]>nums2[right]){
            list.add(nums2[right]);
            right++;
        }
        else {
            list.add(nums1[left]);
             left++;
        }
        }

        while(left<=mid){
        list.add(nums1[left]);
        left++;
        }
 while(right<=high){
        list.add(nums2[ right]);
         right++;
        }

    

    for(int i=0;i<list.size();i++){
        nums1[i]=list.get(i);
    }
    }
        }
    
