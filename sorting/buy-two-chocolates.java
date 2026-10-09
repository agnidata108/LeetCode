class Solution {
    public int buyChoco(int[] prices, int money) {
        for(int m=0; m<prices.length-1; m++)
        {
            for(int n=0; n<prices.length-1-m; n++)
            {
                if(prices[n]>prices[n+1])
                {
                    int temp=prices[n];
                    prices[n]=prices[n+1];
                    prices[n+1]=temp;
                }
            }
        }
        int cost=prices[0] + prices[1];
        if(cost<=money)
        {return money-cost;}
        
        return money;       
    }
}