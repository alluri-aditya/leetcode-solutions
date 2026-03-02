class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i = 0;i<n;i++) {
            if(!dq.isEmpty() && dq.peekFirst()<=i-k) {
                dq.pollFirst();//removing the  elements out of range
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) {
                dq.pollLast();//removing last element
            }
            //add the bigger element
            dq.offer(i);
            //store the result
            if(i>=k-1) {
                result[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}