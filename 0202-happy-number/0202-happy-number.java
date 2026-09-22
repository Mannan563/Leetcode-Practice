class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4)
        {
            n=calc(n);
            System.out.println(n);
        }
        if(n==1)
            return true;
        else
            return false;
    }
    public int calc(int n)
    {
        int m,z=0;
        if(n<10)
            return n*n;
        else
        {  
            while(n!=0)
            {
                m=n%10;
                z+=(m*m);
                n/=10;
            }
            return z;
        }
    }
}