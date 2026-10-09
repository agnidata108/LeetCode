class Solution {
    public int minimumDeletions(int[] nums) {
        int minidx=0,maxidx=0;
        int n=nums.length;

        for(int i=1;i<n;i++)
        {
            if(nums[i]<nums[minidx])
                minidx=i;

            if(nums[i]>nums[maxidx])
                maxidx=i;
        }

        int first=Math.max(minidx,maxidx)+1;
        int last=n-Math.min(minidx,maxidx);

        int middle=Math.min(minidx,maxidx)+1+n-Math.max(minidx,maxidx);

        return Math.min(first,Math.min(last,middle));

    }
}