class Solution {
    public int trap(int[] height) {
        //two pointers
        int left = 0;
        int right = height.length-1;
        int leftmax = 0;//left maximum wall
        int rightmax = 0;//right maximum wall
        int totalwater = 0;
        while(left<right) {
            //update leftmax and rightmax
            leftmax = Math.max(leftmax,height[left]);
            rightmax = Math.max(rightmax,height[right]);
            if(leftmax<rightmax) {
                totalwater+=leftmax-height[left];
                left++;
            } else {
                totalwater+=rightmax-height[right];
                right--;
            }
        }
        return totalwater;
    }
}