class Solution {
    public boolean isAnagram(String s, String t) {
    //     Map<Character,Integer> mapp=new HashMap<>();
    //    for(int i=0;i<s.length();i++){
    //     mapp.put(s.charAt(i),mapp.getOrDefault(s.charAt(i),0)+1);
    //    }

//if(s.length()!=t.length()) return false;
        char[] ch=  t.toCharArray();
        Arrays.sort(ch);
       
         char[] chars=  s.toCharArray();
        Arrays.sort(chars);
       
       return  Arrays.equals(ch,chars);
        }

 
    }
