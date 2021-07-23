class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a,b;
        int arrli[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arrli[0]=i;
                    arrli[1]=j;
                   break;
                }
            }
        }
        return arrli;
}
}
