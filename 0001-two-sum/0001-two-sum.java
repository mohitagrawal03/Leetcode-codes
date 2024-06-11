class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // Time complexity is high but works
        // int[] result = new int[2];
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             result[0] = i;
        //             result[1] = j;
        //             return result;
        //         }
        //     }
        // }
        // return result;
        
        // Incomplete solution
        // Arrays.sort(nums);
        // int[] result = new int[2];
        // int i = 0, j = nums.length - 1;
        // while(i != j){
        //     if(nums[i] + nums[j] > target){
        //         j--;
        //     } else if(nums[i] + nums[j] < target){
        //         i++;
        //     } else{
        //         result[0] = i;
        //         result[1] = j;
        //         break;
        //     }
        // }
        // return result;
        
        Map<Integer, Integer> hm = new HashMap<>();
        int compliment;
        for(int i = 0; i < nums.length; i++){
            compliment = target - nums[i];
            if(hm.containsKey(compliment)){
                return new int[]{hm.get(compliment), i};
            } else{
                hm.put(nums[i], i);
            }
        }
        
        return new int[]{};
    }
}