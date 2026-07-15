// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n=nums1.length+nums2.length;
//         int merge[]=new int[n];
//         for(int i=0;i<;i++){
//             if(i<nums1.length){
// merge[i]=nums1[i];
//             }          
// else {
//     merge[i]=nums2[i];
            
//         }
//     }
// }

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int n=nums1.length+nums2.length;
         int merge[]=new int[n];
    System.arraycopy(nums1, 0, merge, 0, nums1.length);
    System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);
    Arrays.sort(merge);

    if(merge.length%2==0){
        return (merge[merge.length/2]+merge[(merge.length-2)/2])/2.0;
    }
    else{
        return merge[merge.length/2];
    }
  }
}