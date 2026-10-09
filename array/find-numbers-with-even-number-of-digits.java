class Solution {
    public int findNumbers(int[] nums) {
        int evDiNo=0;
        for(int i=0; i<nums.length; i++)
        {
            if(evenDigit(nums[i]))
                evDiNo++;
        }
        return evDiNo;
    }
    public boolean evenDigit(int n)
    {
        int count=0;
        for(int i=n;i>0;i/=10)
        {
            int d=i%10;
            count++;
        }
        if(count%2==0)
        return true;
        else 
        return false;
    }
}