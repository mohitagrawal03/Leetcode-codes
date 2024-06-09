class Solution {
    public void moveZeroes(int[] nums) {
        
        // SNOWBALL METHOD
        int snowballSize = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                snowballSize++;
            } else if(snowballSize > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowballSize] = temp;
            }
        }
    }
}