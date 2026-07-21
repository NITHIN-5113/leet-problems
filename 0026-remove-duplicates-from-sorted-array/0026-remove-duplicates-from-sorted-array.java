class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>s=new LinkedHashSet<>();
        for(int num:nums)
        {
            s.add(num);
        }
        int i=0;
        for(int x:s)
        {
            nums[i]=x;
            i++;
        }
        return i;
    }
}