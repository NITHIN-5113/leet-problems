class Solution {
    public int gcdOfOddEvenSums(int n) {
         int sumodd=n*n;
         int sumeve=n*(n+1);
         while (sumeve != 0) {
            int temp = sumeve;
            sumeve = sumodd % sumeve;
            sumodd = temp;
        }
        return sumodd;
    }
}