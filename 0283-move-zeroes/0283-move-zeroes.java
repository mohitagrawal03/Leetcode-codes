class Solution {
    public void moveZeroes(int[] nums) {
        // very high time complexity but works
        // int temp;
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == 0){
        //         count++;
        //     }
        // }
        // for(int i = 0; i < count; i++){
        //     for(int j = 1; j < nums.length-i; j++){
        //         if(nums[j-1] == 0 && nums[j] != nums[j-1]){
        //             temp = nums[j];
        //             nums[j] = nums[j-1];
        //             nums[j-1] = temp;
        //         }
        //     }
        // }
        
        // int i = 0;
        // int j = 0;
        // int temp;
        // while(){
        //     if(nums[i] != 0){
        //         i++;
        //         j++;
        //     }else if(nums[j] == 0){
        //         j++;
        //     }else {
        //         temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //     }
        // }
        
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