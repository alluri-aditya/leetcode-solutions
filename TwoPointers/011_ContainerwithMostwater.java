class Solution {
    public int maxArea(int[] height) {
        //using two pointers
        int left = 0;
        int right = height.length-1;
        //intitally maxarea is 0
        int maxarea = 0;
        while(left<right) {
            //calculate area = height*width
            int area = Math.min(height[left],height[right]) * (right-left);
            //update maxarea
            maxarea = Math.max(maxarea,area);
            if(height[left]<height[right]) {
                left++;//move forward left pointer
            } else {
                right--;//move backwoard right pointer
            }
        }
        return maxarea;
    }
}