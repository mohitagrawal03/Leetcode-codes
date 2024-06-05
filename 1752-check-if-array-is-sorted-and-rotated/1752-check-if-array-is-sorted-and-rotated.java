class Solution {
    
    // Very Unefficient but works
//     public boolean check(int[] nums) {
//         int[] rot_nums = new int[nums.length];
//         for(int x = 0; x < nums.length; x++){
//             boolean sorted = true;
            
//             for(int i = 0; i < nums.length; i++){
//                 rot_nums[(i+x) % nums.length] = nums[i];
//             }
            
//             for(int i = 0; i < rot_nums.length-1; i++){
//                 if(rot_nums[i+1] < rot_nums[i]){
//                     sorted = false;
//                     break;
//                 }
//             }
            
//             if(sorted){
//                 return true;
//             }
//         }
//         return false;
//     }
    
    public boolean check(int[] nums){
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i+1) % nums.length]){
                count ++;
                
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
     
}