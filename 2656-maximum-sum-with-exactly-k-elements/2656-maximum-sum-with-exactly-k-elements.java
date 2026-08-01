class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=nums[nums.length-1];
        for(int i=1;i<k;i++)
        {
            sum+=nums[nums.length-1]+i;
            //System.out.println(sum);
        }
        return sum;
    }
}