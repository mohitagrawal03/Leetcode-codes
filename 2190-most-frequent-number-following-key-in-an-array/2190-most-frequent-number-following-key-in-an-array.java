class Solution {
//     public int mostFrequent(int[] nums, int key) {
//         HashMap<Integer, Integer> hm = new HashMap<>();
        
//         int maxValue = 0, maxKey = 0;
//         for (int i = 0; i <= nums.length-2; i++) {
//             if (nums[i] == key) {
//                 hm.put(nums[i+1], hm.getOrDefault(nums[i+1], 0)+1);
//                 if (hm.get(nums[i+1]) > maxValue) {
//                     maxKey = nums[i+1];
//                     maxValue = hm.get(nums[i+1]);
//                 }
//             }
//         }
        
//         int maxKey = 0;
//         int maxValue = 0;
        
//         for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//             if (entry.getValue() > maxValue) {
//                 maxValue = entry.getValue();
//                 maxKey = entry.getKey();
//             }
//         }
        
        //return maxKey;
    
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> freq = new HashMap<>();
        int mostFreq = -1;
        for (int i = 0, n = nums.length, max = 0; i + 1 < n; ++i) {
            if (nums[i] == key) {
                int candidate = nums[i + 1];
                freq.put(candidate, 1 + freq.getOrDefault(candidate, 0));
                if (freq.get(candidate) > max) {
                    max = freq.get(candidate);
                    mostFreq = candidate;
                }
            }
        }
        return mostFreq;
    }
}