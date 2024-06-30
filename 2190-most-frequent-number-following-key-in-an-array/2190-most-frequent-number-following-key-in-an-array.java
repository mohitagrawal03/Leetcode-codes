class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i <= nums.length-2; i++) {
            if (nums[i] == key) {
                hm.put(nums[i+1], hm.getOrDefault(nums[i+1], 0)+1);
            }
        }
        
        int maxKey = 0;
        int maxValue = 0;
        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
        return maxKey;
    }
}