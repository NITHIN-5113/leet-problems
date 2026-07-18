class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        while(b%a!=0)
        {
            int c=b%a;
            b=a;
            a=c;
        }
        return a;
    }
}