class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder sb=new StringBuilder();
       StringBuilder s=new StringBuilder();
       for(String i:word1)
       {
        sb.append(i);
       }
       for(String j:word2)
       {
        s.append(j);
       }
       if (sb.length() != s.length()) {
    return false;
}
for (int i = 0; i < sb.length(); i++) {
    if (sb.charAt(i) != s.charAt(i)) {
        return false;
    }
}
return true;
    }
}