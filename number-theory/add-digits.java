class Solution {
    public int extract_digit_add(int n)
    {
        int sum=0;
        for(int i=n;i>0;i=i/10)
        {
            int d=i%10;
            sum+=d;
        }
        return sum;
    }
    public int addDigits(int num)
    {
        while(num>9)
        {
            num=extract_digit_add(num);
        }
        return num;
        
    }
}