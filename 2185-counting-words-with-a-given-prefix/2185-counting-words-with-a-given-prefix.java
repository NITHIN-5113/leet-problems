class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int len=pref.length();
        for(String word:words)
        {
            if(word.length()<len)
            {
                continue;
            }
             boolean check=true;
                for(int i=0;i<len;i++)
                {
                    if(word.charAt(i)!=pref.charAt(i))
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