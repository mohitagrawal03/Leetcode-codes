class Solution {
    public int[] rearrangeArray(int[] nums) {
//         int[] posArr = new int[nums.length/2];
//         int[] negArr = new int[nums.length/2];
        
//         int i = 0, j = 0;
//         for (int num : nums) {
//             if (num > 0) {
//                 posArr[i++] = num;
//             } else {
//                 negArr[j++] = num;
//             }
//         }
        
//         i = 0; j = 0; 
//         int k = 0;
//         while (k < nums.length-1) {
//             nums[k] = posArr[i++];
//             nums[k+1] = negArr[j++];
//             k += 2;
//         }
        
//         return nums;
        
        int[] ans = new int[nums.length];
        
        int i = 0, j = 1;
        for (int num : nums) {
            if (num > 0) {
                ans[i] = num;
                i += 2;
            } else {
                ans[j] = num;
                j += 2;
            }
        }
        
        return ans;
    }
}

// int[] tempArr = new int[nums.length];
        
//         int i = 0, n = nums.length/2;
//         for (int num : nums) {
//             if (num > 0) {
//                 tempArr[i++] = num;
//                 n--;
//             } else {
//                 tempArr[i+n] = num;
//                 n++;
//             }
//         }
        
//         for (int i = 0; i < nums.length/2; i++) {
//             nums[i] = tempArr[i]
//         }
        
//         return tempArr;