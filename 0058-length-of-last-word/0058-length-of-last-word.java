class Solution {
    public int lengthOfLastWord(String s) 
    {
        String ans=s.strip();
        int num=ans.length()-1;
        int count=0;
        while(num>=0 && ans.charAt(num)!=' ')
        {
            count++;
            num--;
        }
        while(num>=0 && ans.charAt(num)==' ')
        {
            num--;
        }
        System.out.println(count);
        return count;
    }
}
