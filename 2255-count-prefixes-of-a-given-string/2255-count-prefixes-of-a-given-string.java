class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String word:words)
        {
            if(word.length()>s.length())
            {
                continue;
            }
            boolean check=true;
            for(int i=0;i<word.length();i++)
            {
                if(word.charAt(i)!=s.charAt(i))
                {
                    check=false;
                    break;
                }
            }
            if(check)
            {
                count++;
            }
        }
        return count;
    }
}