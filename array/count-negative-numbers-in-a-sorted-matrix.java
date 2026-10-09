class Solution {
    public int countNegatives(int[][] grid) {
        int negtv=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int r=0; r<m; r++)
        {
            for(int c=0; c<n; c++)
            {
                if(grid[r][c]<0)
                {
                    negtv++;
                }
            }
        }
        return negtv;
    }
}