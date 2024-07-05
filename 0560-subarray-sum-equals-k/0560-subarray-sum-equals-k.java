// class Solution {
//     public int subarraySum(int[] nums, int target) {
        
//         // BRUTE FORCE T.C. = O(n^3)
//         int count = 0, sum = 0;
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {
//                 sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += nums[k];
//                 }
//                 if (sum == target) {
//                         count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int subarraySum(int[] nums, int k) {
        // Optimal Approach
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int count = 0, preSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            
            if (hm.containsKey(preSum - k)) {
                count += hm.get(preSum - k);
            }
            
            hm.put(preSum, hm.getOrDefault(preSum, 0)+1);
        }
        
        return count;
    }
}