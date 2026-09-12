class Solution {
    public int[] plusOne(int[] digits) {
     //   int sum = digits[digits.length-1]+1;
        int size=digits.length;
       int result []=new int[size+1];
       for(int i=size-1;i>=0;i--){
         if(digits[i]<9){
            digits[i]+=1;
            return digits;
        } 
        else  {
            digits[i]=0;
            
        }
        result[0]=1;
        
        }
        return result ;
       }

    }
