class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boat=0;
        int left=0;
        int right=people.length-1;
        Arrays.sort(people);
        while(left<=right)
        { 
            int sum=people[left]+people[right];
            if(sum<=limit)
            {
                boat++;
                left++;
                right--;
            }
            else
            {
                boat++;
                right--;
            }
        }   
        return boat;     
    }
}