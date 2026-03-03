class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currmax = 0;
        int currmin = 0;
        int maxsum = nums[0];
        int minsum = nums[0];
        for(int i =0;i<nums.length;i++) {
            currmax = Math.max(currmax+nums[i],nums[i]);
            maxsum = Math.max(currmax,maxsum);
            currmin = Math.min(currmin+nums[i],nums[i]);
            minsum = Math.min(minsum,currmin);
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}