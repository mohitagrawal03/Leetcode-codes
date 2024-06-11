class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i], freq.get(nums[i])+1);
            } else{
                freq.put(nums[i], 1);
            }
        }
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;

        // Iterate through the map
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}