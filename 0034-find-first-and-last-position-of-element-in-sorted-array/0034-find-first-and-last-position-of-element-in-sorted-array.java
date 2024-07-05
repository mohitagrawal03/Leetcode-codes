class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        int l = 0, h = nums.length-1;
        int m = -1;
        boolean found = false;
        while (l<=h) {
            m = (l+h)/2;
            if (nums[m] == target) {
                found = true;
                break;
            } else if (nums[m] > target){
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        
        if (!found) {
            ans[0] = -1;
            ans[1] = -1;
            return ans;
        }
        
        int i = m;
        while (i < nums.length-1) {
            if (nums[i+1] != nums[m]){
                break;
            } else {
                i++;
            }
        }
        ans[1] = i;
        
        i = m;
        while (i > 0) {
            if (nums[i-1] != nums[m]){
                break;
            } else {
                i--;
            }
        }
        ans[0] = i;
        
        return ans;
    }
}