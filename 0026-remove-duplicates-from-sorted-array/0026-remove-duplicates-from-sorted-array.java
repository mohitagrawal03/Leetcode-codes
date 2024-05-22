class Solution {
    // public int removeDuplicates(int[] nums) {
    //     int[] res = new int[nums.length];
    //     int k = 0;
    //     int count = 1;
    //     res[0] = nums[0];
    //     for(int i = 1; i < nums.length; i++){
    //         if(res[k] != nums[i]){
    //             k++;
    //             res[k] = nums[i];
    //             count++;
    //         }
    //     }
    //     for(int i = 0; i < nums.length; i++){
    //         nums[i] = res[i];
    //     }
    //     return count;
    // }
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}