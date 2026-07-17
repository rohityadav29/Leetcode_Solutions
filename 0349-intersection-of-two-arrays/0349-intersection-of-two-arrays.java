class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
Arrays.sort(nums2);
int i=0,j=0;
int n1=nums1.length;
int n2=nums2.length;
ArrayList<Integer>unionResult=new ArrayList<>();  
  
 while (i < n1 && j < n2) {


            if (nums1[i] == nums2[j]) {
                if(unionResult.size()==0||unionResult.get(unionResult.size()-1)!=nums1[i]){
  unionResult.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }

        }
        int result[]=new int[unionResult.size()];
        for(int k=0;k<unionResult.size();k++){
            result[k]= unionResult.get(k);
        }

        return result;
    }
}


    
