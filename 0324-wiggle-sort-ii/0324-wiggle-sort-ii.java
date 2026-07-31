class Solution {
    public void wiggleSort(int[] nums) {
        int arr[]=nums.clone();
        Arrays.sort(arr);
        int a=(nums.length-1)/2;
        int b=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=arr[a--];
            }
            else{
            nums[i]=arr[b--];
            }
        }
    }
}