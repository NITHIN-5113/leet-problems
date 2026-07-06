class Solution {
    public int[] concatWithReverse(int[] nums) {
        int []arr=new int[nums.length*2];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
            count++;
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[count]=nums[i];
            count++;
        }
        return arr;
    }
}