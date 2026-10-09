public class Solution {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double avg=0; int c=0;
        for(int i=1; i<salary.length-1; i++)
        {
            avg+=salary[i];
            c++;
        }
        avg=avg/c;
        return avg;
    }
}