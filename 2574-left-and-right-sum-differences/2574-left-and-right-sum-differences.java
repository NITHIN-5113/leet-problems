class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []leftarr=new int[nums.length];
        int []rightarr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            leftarr[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            rightarr[i]=sum;
            sum+=nums[i];
        }
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Math.abs(leftarr[i]-rightarr[i]);
        }
        
        return ans;
    }
}