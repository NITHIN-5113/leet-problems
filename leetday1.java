//3110. Score of a String

class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            score += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return score;
    }
}

//1929. Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] res=new int[2*n];
        for(int i=0;i<n;i++)
        {
            res[i]=nums[i];
            res[i+n]=nums[i];
        }
        return res;
    }
}

//217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            if(set.contains(i))
            {
                return true;
            }
            set.add(
                i);
        }
        return false;
    }
}
