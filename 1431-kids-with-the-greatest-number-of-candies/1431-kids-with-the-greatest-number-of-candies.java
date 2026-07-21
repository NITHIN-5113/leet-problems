class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int max=0;
        for(int i:candies)
        {
            max=Math.max(max,i);
        }
        for(int j:candies)
        {
            l.add(j+extraCandies>=max);
        }
        return l;
    }
}