class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int max = nums.length%2 == 0 ? nums.length/2 : nums.length/2 + 1;
        for(int i = 0; i < nums.length; i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i], freq.get(nums[i])+1);
            } else{
                freq.put(nums[i], 1);
            }
            if(freq.get(nums[i]) >= max){
                    return nums[i];
            }
        }
//         int maxKey = -1;
//         int maxValue = Integer.MIN_VALUE;

//         // Iterate through the map
//         for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
//             if (entry.getValue() > maxValue) {
//                 maxValue = entry.getValue();
//                 maxKey = entry.getKey();
//             }
//         }
        return 0;
    }
}