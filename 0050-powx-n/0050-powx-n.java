class Solution {
    public double myPow(double x, int n) {
        double res=0;
        if(x!=0 || n>0)
        {
            res=Math.pow(x,n);
        }
        return res;
    }
}