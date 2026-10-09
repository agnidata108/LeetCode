class Solution
{
    public int[][] matrixReshape(int[][] mat, int r, int c)
    {
        int m=mat.length;
        int n=mat[0].length;

        if (m*n != r*c)
        {
            return mat;
        }

        int[][] result = new int[r][c];

        for (int i=0; i<m*n; i++)
        {
            int oldRowIndx = i/n;
            int oldColIndx = i%n;
            
            int newRowIndx = i/c;
            int newColIndx = i%c;
            result[newRowIndx][newColIndx] = mat[oldRowIndx][oldColIndx];
        }
        return result;
    }
}