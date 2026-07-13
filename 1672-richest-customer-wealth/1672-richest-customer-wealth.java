class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int len=accounts.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<accounts[0].length;j++)
            {
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
            sum=0;
        }
        return max;
    }
}