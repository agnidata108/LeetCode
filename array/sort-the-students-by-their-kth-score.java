class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int m=score.length; //No. of studetns

        for(int i=0;i<m-1;i++)
        {
            int maxStuRo=i;

            // Find row(student) with max score in column k(exam)
            for(int j=i+1;j<m;j++)
            {
                if(score[j][k]>score[maxStuRo][k])
                //K-exam same rakha h, j aur maxStuRo(current) me compare kar rhe
                {
                    maxStuRo=j;
                }
            }

            // Swap karenge current row with row jisme highest score h
            int[] temp=score[i];
            score[i]=score[maxStuRo];
            score[maxStuRo]=temp;
        }

        return score;

    }
}