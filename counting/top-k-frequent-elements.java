class Solution {
    public int[] topKFrequent(int[] nums,int k) {
        int n=nums.length;
        int[] freq=new int[n];
        boolean[] visited=new boolean[n];

        for(int i=0;i<n;i++)
        {
            if(visited[i])
                continue;

            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    c++;
                    visited[j]=true;
                }
            }
            freq[i]=c;
        }

        int[] ans=new int[k];

        for(int i=0;i<k;i++)
        {
            int max=-1,index=-1;

            for(int j=0;j<n;j++)
            {
                if(!visited[j]&&freq[j]>max)
                {
                    max=freq[j];
                    index=j;
                }
            }

            ans[i]=nums[index];
            visited[index]=true;
        }

        return ans;
        
    }
}