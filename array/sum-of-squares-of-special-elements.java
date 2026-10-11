class Solution {
    public int sumOfSquares(int[] nums) {
        
        int n=nums.length;
        int sum = 0;
        
        // Loop se each element index 1 se n
        for(int i=1;i<=n;i++)
        {
            // Check agar index n ko poora divide karta hai
            if(n%i==0)
            {
                // Special element ka square add karenge
                sum += nums[i-1] * nums[i-1];
            }
        }       
        return sum;
        
    }
}