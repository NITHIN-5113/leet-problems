class Solution {
    public int maxProduct(int n) {
        int pro=1;
        int fmax=0;
        int smax=0;
        while(n>0)
        {
            int digit=n%10;
            if(digit>fmax)
            {
              smax=fmax;
              fmax=digit;
            }
            else if(digit>smax)
            {
                smax=digit;
            }
            n/=10;
            pro=fmax*smax;
        }
        return pro;
        // List<Integer> l=new ArrayList<>();
        // while(n>0)
        // {
        //     int digit=n%10;
        //     l.add(digit);
        //     n/=10;
        // }
        // Collections.sort(l);
        // return l.get(l.size()-1)*l.get(l.size()-2);
    }
}