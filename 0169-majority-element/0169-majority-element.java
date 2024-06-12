// class Solution {
//     public int majorityElement(int[] nums) {
//         Map<Integer, Integer> freq = new HashMap<>();
//         int max = nums.length%2 == 0 ? nums.length/2 : nums.length/2 + 1;
//         for(int i = 0; i < nums.length; i++){
//             if(freq.containsKey(nums[i])){
//                 freq.put(nums[i], freq.get(nums[i])+1);
//             } else{
//                 freq.put(nums[i], 1);
//             }
//             if(freq.get(nums[i]) >= max){
//                     return nums[i];
//             }
//         }
// //         int maxKey = -1;
// //         int maxValue = Integer.MIN_VALUE;

// //         // Iterate through the map
// //         for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
// //             if (entry.getValue() > maxValue) {
// //                 maxValue = entry.getValue();
// //                 maxKey = entry.getKey();
// //             }
// //         }
//         return 0;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}