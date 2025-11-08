class LeftSumRightSumEqual{
    /* Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
    where leftSum[i]=Sum of all elements before that index. leftSum[0]=0
    and rightSum[i]=Sum of all elements after that index. rightSum[n-1
    */ 
    public int[] leftRightDifference(int[] nums) {
      int[] ans=new int[nums.length];
      int sum=0;
      for(int i=0;i<nums.length;i++) {
        sum+=nums[i];
    }

     int cursum=0;
     for(int i=0;i<nums.length;i++) {
        sum-=nums[i];
        ans[i]=Math.abs(sum-cursum);
        cursum+=nums[i];
     }
     return ans;
    }
}