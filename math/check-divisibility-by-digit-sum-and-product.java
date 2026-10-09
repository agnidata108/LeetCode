class Solution {
    public boolean checkDivisibility(int n) {
        int dgsum=0;
        int dgprod=1;
        int nc=n;
        while(nc>0)
        {
            dgsum+=nc%10;
            dgprod*=nc%10;
            nc=nc/10;
        }
        if(n%(dgsum+dgprod)==0)
        return true;
        else
        return false;
    }
}