class Solution {
    public int subarraySum(int[] nums, int k) {
        //initially
        int count = 0;
        int sum = 0;
        //creating new hash map
        Map<Integer,Integer> map = new HashMap<>();
        //starting add (0,1)
        map.put(0,1);
        //iterate the array
        for(int i =0;i<nums.length;i++) {
            sum = sum +nums[i];
            //check sum-k exists in map or not
            if(map.containsKey(sum-k)) {
                count = count+ map.get(sum-k);
            }
            //put the sum to map
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}