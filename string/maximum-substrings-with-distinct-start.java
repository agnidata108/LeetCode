class Solution {
    public int maxDistinct(String s) {
        boolean[] seen=new boolean[26];
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            int index=s.charAt(i)-'a';

            if(!seen[index])
            {
                count++;
                seen[index]=true;
            }
        }

        return count;
        
    }
}