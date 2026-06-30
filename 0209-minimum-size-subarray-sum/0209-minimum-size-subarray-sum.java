class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    //    int count=0;
    //     int min=Integer.MAX_VALUE;
    //     int i=0;
    //     while(i<nums.length)
    //     {
    //     int sum=0;
    //     count=0;
    //     for(int j=i;j<nums.length;j++)
    //     {
    //         count++;
    //        sum+=nums[j];
    //        if(sum>=target)
    //        {
    //         break;
    //        }
    //     }
    //     if(sum>=target&&count<=min)
    //     {
    //         min=Math.min(count,min);
    //     }
    //     i++;
    //     }
    //     if(min==Integer.MAX_VALUE)
    //     {
    //         return 0;
    //     }
    //    return min;
    int left=0;
    int sum=0;
    int min=Integer.MAX_VALUE;
    for(int r=0;r<nums.length;r++)
    {
        sum+=nums[r];
        while(sum>=target)
        {
            min=Math.min(min,r-left+1);
            sum-=nums[left];
            left++;
        }

    }
    if(min==Integer.MAX_VALUE)
    {
        return 0;
    }
    return min;
    }
}