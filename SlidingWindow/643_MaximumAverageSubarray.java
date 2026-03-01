class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length-1;
        //sliding window
        //iterate upto k
        int windowsum = 0;
        for(int i = 0;i<k;i++){
            //calculate sum
            windowsum = windowsum + nums[i];
        }
        int maxsum = windowsum;
        //now from k to n
        for(int  i =k;i<=n;i++) {
            //sum = sum-leaving element+entering element
            windowsum = windowsum-nums[i-k]+nums[i];
            maxsum = Math.max(maxsum,windowsum);
        }
        return (double) maxsum/k;
    }
}