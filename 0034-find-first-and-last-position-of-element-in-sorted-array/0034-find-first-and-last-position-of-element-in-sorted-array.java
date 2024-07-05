// Beats: 100% but worst case T.C. = O(n) [maybe testcases are weak]
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] ans = new int[2];
        
//         int l = 0, h = nums.length-1;
//         int m = -1;
//         boolean found = false;
//         while (l<=h) {
//             m = (l+h)/2;
//             if (nums[m] == target) {
//                 found = true;
//                 break;
//             } else if (nums[m] > target){
//                 h = m - 1;
//             } else {
//                 l = m + 1;
//             }
//         }
        
//         if (!found) {
//             ans[0] = -1;
//             ans[1] = -1;
//             return ans;
//         }
        
//         int i = m;
//         while (i < nums.length-1) {
//             if (nums[i+1] != nums[m]){
//                 break;
//             } else {
//                 i++;
//             }
//         }
//         ans[1] = i;
        
//         i = m;
//         while (i > 0) {
//             if (nums[i-1] != nums[m]){
//                 break;
//             } else {
//                 i--;
//             }
//         }
//         ans[0] = i;
        
//         return ans;
//     }
// }

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        // Find lower bound
        lowerBound(nums, target, ans);
        
        if(ans[0] == -1) return ans;
        
        // Find upper bound
        upperBound(nums, target, ans);
        
        return ans;
    }
    
    public void lowerBound(int[] nums, int target, int[] ans) {
        int l = 0, h = nums.length-1;
        int m;
        int lB = nums.length;
        while (l<=h) {
            m = (l+h)/2;
            if (nums[m] >= target) {
                lB = m;
                h = m-1;
            } else {
                l = m+1;
            }
        }
    
        if (lB == nums.length || nums[lB] != target) {
            ans[0] = -1;
            ans[1] = -1;
        } else {
            ans[0] = lB;
        }
    }

    public void upperBound(int[] nums, int target, int[] ans) {
        int l = 0, h = nums.length-1;
        int m;
        int uB = nums.length;
        while (l<=h) {
            m = (l+h)/2;
            if (nums[m] > target) {
                uB = m;
                h = m-1;
            } else {
                l = m+1;
            }
        }
    
        ans[1] = uB-1;
    }
}