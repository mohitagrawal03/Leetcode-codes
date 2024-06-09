// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int[] ans = new int[nums.length];
//         int k = 0;
//         ans[0] = nums[0];
//         for(int i = 1; i < nums.length; i++){
//             if(ans[k] < nums[i]){
//                 k++;
//                 ans[k] = nums[i];
//             }
//         }
//         for(int i = 0; i < nums.length; i++){
//             nums[i] = ans[i];
//         }
//         return k;
//     }
// }

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0; // Points to the index of the last unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1; // k is zero-based, so we need to add 1 to get the count
    }
}
