class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start =1;
        int end =0;
        for(int num:piles) {
            end = Math.max(end,num);
        }
        while(start<end) {
            int mid = start+(end-start)/2;//speed
            int hours =0;
            for(int num:piles) {
                hours+= Math.ceil((double)num/mid);
            }
            if(hours>h) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return start;//or end since  at one point start=mid=end!!
    }
}