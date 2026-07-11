class Solution {
    public String firstPalindrome(String[] words) {
       for(String word : words)
       {
        int i=0;
        int j=word.length()-1;
        boolean pal=true;
        while(i<j)
        {
        if(word.charAt(i)!=word.charAt(j))
        {
            pal=false;
            break;
        }
        i++;
        j--;
       }
       if(pal) 
       {
        return word;
       }
       }
       return "";
    }
}