class Solution {
    public int minElement(int[] nums) {
        int j=0;
        for(int i:nums)
        {
            int temp=i;
            int sum=0;
            while(temp!=0)
            {
                
                int digits=temp%10;
                sum+=digits;
                temp/=10;
            }
            if(j<nums.length)
            {
            nums[j++]=sum;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;
    }
}