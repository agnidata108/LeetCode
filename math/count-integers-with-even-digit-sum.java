class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1; i<=num; i++)
        {
            if(digSum(i)%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public int digSum(int n)
    {
        int sum=0;
        if(n<10)
        return n;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}