class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
        }
        for(int i = 0; i < count; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[j-1] == 0 && nums[j] != nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}