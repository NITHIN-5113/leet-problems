class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] s1 = s.split(" ");
        for(String s2:s1)
        {
        StringBuilder ss=new StringBuilder(s2);  
        ss.reverse();
        sb.append(ss);
        sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}