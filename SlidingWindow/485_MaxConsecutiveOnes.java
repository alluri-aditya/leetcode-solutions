class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // //initially count and maxcount = 0;
        // int count = 0;
        // int maxcount = 0;
        // for(int i =0;i<nums.length;i++) {
        //     if(nums[i] == 1) {
        //         count++;
        //         maxcount = Math.max(maxcount,count);
        //     } else {
        //         count = 0;
        //     }
        // }
        // return maxcount;

        //using sliding window
        int left = 0;
        int maxlen = 0;
        for(int right = 0;right<nums.length;right++) {
            if(nums[right] == 0) {
                left = right+1;//resetting the window
            }
            maxlen = Math.max(maxlen,right-left+1);//window size = right-left+1
        }
        return maxlen;
    }
}