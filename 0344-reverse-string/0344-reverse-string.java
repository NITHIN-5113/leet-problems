class Solution {
    public void reverseString(char[] s) {
        // int left=0;
        // int right=s.length-1;
        // while(left<=right)
        // {
        //     char temp=s[left];
        //     s[left]=s[right];
        //     s[right]=temp;
        //     left++;
        //     right--;

        for(int i=0;i<s.length/2;i++)
        {
            swap(s,i,s.length-1-i);
        }
    }
    public void swap(char[] s, int i,int j)
    {
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}