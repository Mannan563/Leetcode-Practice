class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int first=0;
        int last=n-1;
        while(first<last)
        {
            char temp=s[first];
            s[first]=s[last];
            s[last]=temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(s));
    }
}