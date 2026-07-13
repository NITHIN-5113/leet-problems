class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        int count=0;
        for(int i:nums)
        {
            sum+=i;
        }
        while(sum%k!=0)
            {
                sum-=1;
                count++;
            }
        return count;
    }
}