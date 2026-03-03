class Solution {
    public int maxProduct(int[] nums) {
        int currentproduct = 1;
        int maxproduct = nums[0];
        for(int  i =0;i<nums.length;i++) {
            currentproduct = currentproduct * nums[i];
            maxproduct = Math.max(maxproduct,currentproduct);
            if(currentproduct == 0) {
                currentproduct = 1;
            }
        }
        currentproduct = 1;
        //right to left
        for(int i =nums.length-1;i>=0;i--) {
            currentproduct *=nums[i];
            maxproduct = Math.max(maxproduct,currentproduct);
            if(currentproduct == 0) {
                currentproduct = 1;
            }
        }
        return maxproduct;
    }
}