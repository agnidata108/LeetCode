class Solution
{
    public boolean findRotation(int[][] mat,int[][] target)
    {
        // Total 4 rotations possible hoti h (0 90 180 270deg)
        for(int k=0;k<4;k++)
        {
            // Agar matrix target k equal ho gyi to true return krenge
            if(isEqual(mat,target))
            {
                return true;
            }
            // Agli check ke liye matrix ko 90deg clockwise rotate krenge
            rotate(mat);
        }
        // Agar 4 baar rotate karne par bhi match nahi hua toh false return krenge
        return false;
    }

    public boolean isEqual(int[][] a,int[][] b)
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                // Agar koi bhi element match nahi karta toh false return karenge
                if(a[i][j]!=b[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public void rotate(int[][] matrix)
    {
        int n=matrix.length;

        // Matrix ka transpose nikal rhe h (rows ko columns se swap kar rahe h)
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // Har row ko reverse kr rhe h taki final 90deg clockwise rotation mil jaye
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        
    }
}