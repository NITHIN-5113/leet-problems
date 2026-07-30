class Solution {
    public String smallestPalindrome(String s) {
         int n=s.length();
         int slen=n/2;
         char[] ch=new char[slen];
         for(int i=0;i<slen;i++)
         {
            ch[i]=s.charAt(i);
         }
        Arrays.sort(ch);
        StringBuilder sb=new StringBuilder();
         for(int i=0;i<slen;i++)
        {
            sb.append(ch[i]);
        } 

        if(n%2!=0)
        {
            sb.append(s.charAt(slen));
        }
         for(int i=slen-1;i>=0;i--)
        {
            sb.append(ch[i]);
        }
         return sb.toString();
    }
}