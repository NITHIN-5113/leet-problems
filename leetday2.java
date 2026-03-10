// 392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {t
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}

// 1299. Replace Elements with Greatest Element on Right Side

class Solution {
    public int[] replaceElements(int[] arr) {
      // solution 1
        int i=arr.length-1;
        int max=-1;

        while(
            i>=0){
            int temp=arr[i];
            arr[i]=max;

            if(temp>max)
            {
                max=temp;
            }
            i--;
        }
        return arr;
      //solution 2
        int max=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            int current=arr[i];
            arr[i]=max;
            max=Math.max(max,current);
        }
        return arr;
    }
}

  // 242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] freq=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']=freq[c-'a']+1;
        }
        for(char c:t.toCharArray())
        {
            freq[c-'a']=freq[c-'a']-1;
        }
        for(int i:freq)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }
}

