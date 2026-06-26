class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=nums[nums.length-1]-nums[0];
        return (long) ans*k;
    }
}