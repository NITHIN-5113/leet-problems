class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<right)
        {
            int Minimumheight=Math.min(height[left],height[right]);
            int water=right-left;
            maxarea=Math.max(maxarea,Minimumheight*water);
            if(height[left]<height[right]) left++;
            else right--; 
        }
        return maxarea;
    }
}