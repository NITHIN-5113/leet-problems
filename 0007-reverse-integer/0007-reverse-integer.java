class Solution {
    public int reverse(int x) {
        int original=x;
        long rev=0;
        int rem=0;
        while(x!=0)
        {
            rem=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
            {
                return 0;
            }
            rev=rev*10+rem;
            x/=10;
        }
            if(original<0)
            {
                rev=1*rev;
            }
        
        return (int)rev;
    }
}