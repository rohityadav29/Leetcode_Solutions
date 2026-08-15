class Solution {
    public int maximumLengthSubstring(String s) {
   Map<Character,Integer> mapp= new HashMap<>();
   int left=0;
   int ans =0;

for( int right=0;right<s.length();right++){
mapp.put(s.charAt(right),mapp.getOrDefault(s.charAt(right),0)+1);
while(mapp.get(s.charAt(right))>2){
    mapp.put(s.charAt(left),mapp.get(s.charAt(left))-1);
    left++;
}

ans= Math.max( ans,right-left+1);

}
return ans;



    }
}