class Solution {
    public int reverse(int x) {
        long ans=rev(x);
        if(ans<(Integer.MAX_VALUE-1) && ans>(Integer.MIN_VALUE)) return (int)ans;
        else return 0;
    }
    public long rev(int c)
    {
        long y=0;
        long m=c;
        while(m!=0)
        {
            y=y*10+m%10;
            m/=10;
        }
        return y;
    }
}