class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(j)!=s.charAt(i))
            {
                return false;
            }
            j++;
        }
        return true;
    }
}