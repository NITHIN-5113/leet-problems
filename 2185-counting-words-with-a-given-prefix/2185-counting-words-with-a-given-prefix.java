class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String s:words){
            int l=s.length();
            int l1=pref.length();
            int i=0,j=0;
            boolean t=false;
            if(l1>l) continue;
            while(i<l && j<l1){
                if(s.charAt(i)!=pref.charAt(j)) {
                    t=true;
                    break;
                }
                else {
                    i++;
                    j++;
                }
            }
            if(!t) count++;
        }
        return count;
    }
}