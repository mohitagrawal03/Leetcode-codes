class Solution {
    public int majorityElement(int[] nums) {
        
        // Using HashMap, linear T.C. but there is a better approach 
//         int n = nums.length;
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < n; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }
        
//         n = n / 2;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > n) {
//                 return entry.getKey();
//             }
//         }
        
//         return 0;
        
        // Moore Voting Algo
        int count = 0, cand = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
                count++;
            } else if (nums[i] == cand){
                count++;
            } else{
                count--;
            }
        }
        return cand;
    }
}