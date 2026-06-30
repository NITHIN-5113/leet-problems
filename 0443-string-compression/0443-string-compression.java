class Solution {
    public int compress(char[] chars) {
        int print=0;
        int check=0;
        while(check<chars.length)
        {
            char presentchar=chars[check];
            int count=0;
            while(check<chars.length && chars[check]==presentchar)
            {
                check++;
                count++;
            }
            chars[print++]=presentchar;
            if(count>1)
            {
                for(char c:Integer.toString(count).toCharArray())
                {
                    chars[print]=c;
                    print++;
                }
            }
        }
        return print;
    }
}