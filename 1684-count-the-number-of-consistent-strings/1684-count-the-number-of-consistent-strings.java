class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(char c:allowed.toCharArray())
        {
            set.add(c);
        }
        int count=0;
        for(String word:words)
        {
            boolean check=true;
            for(char c:word.toCharArray())
            {
                if(!set.contains(c))
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