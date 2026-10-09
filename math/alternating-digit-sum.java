class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int sign=1;
        int digits=0;

        for(int i=n;i>0;i=i/10)
        {
            digits++;
        }

        int place=1;
        for(int i=1;i<digits;i++)
        {
            place*=10;
        }

        for(int i=place;i>0;i=i/10)
        {
            int d=n/i;
            sum+=d*sign;
            sign=-sign;
            n=n%i;
        }

        return sum;
    }
}