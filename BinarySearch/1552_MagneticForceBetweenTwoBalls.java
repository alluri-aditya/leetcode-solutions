class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 1;//minimum distance
        int n = position.length;
        int end = position[n-1]-position[0];//last-first max distance
        while(start<=end) {
            int mid = start+(end-start)/2;
            int count = 1;
            int last = position[0];
            for(int i =1;i<n;i++) {
                if(position[i]-last>=mid) {
                    count++;
                    last=position[i];
                }
            }
            if(count>=m) {
                start = mid+1;//right half
            } else {
                end = mid-1;//left half
            }
        }
        return end;
    }
}