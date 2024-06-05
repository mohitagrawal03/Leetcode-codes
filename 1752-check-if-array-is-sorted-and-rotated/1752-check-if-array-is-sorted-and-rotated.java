class Solution {
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
    
    public boolean check(int[] A) {
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1)%n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}