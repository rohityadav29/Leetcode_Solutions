class Solution {
    public int reverse(int x) {
        int duplicate=x;
        int re=0;
        while(duplicate!=0){
        int lastdigit =duplicate%10;
 if (re > Integer.MAX_VALUE / 10 || 
                (re == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }

             
            if (re < Integer.MIN_VALUE / 10 || 
                (re == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
             re=re*10+lastdigit;
        duplicate=duplicate/10;
}             
    return re;
    }
}
