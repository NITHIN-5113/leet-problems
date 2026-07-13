class Solution {
    public int[] concatWithReverse(int[] nums) {
        int []arr=new int[nums.length*2];
        int i=0;
        for(int j=arr.length-1;j>=nums.length;j--)
        {
            arr[i]=nums[i];
            arr[j]=nums[i];
            i++;
        }
        return arr;
    }
}