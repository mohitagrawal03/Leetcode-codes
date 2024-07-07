class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        int m;
        
        while (l <= h) {
            m = (l+h)/2;
            if (nums[m] == target) {
                return true;
            } else if (nums[m] == nums[l]) {
                l++;
            } else if (nums[m] == nums[h]) {
                h--;
            } else if(nums[l] < nums[m]) {
                if (target >= nums[l] && target < nums[m]) {
                    h = m-1;
                } else {
                    l = m+1;
                }
            } else {
                if (target <= nums[h] && target > nums[m]) {
                    l = m+1;
                } else {
                    h = m-1;
                }
            }
        }
        
        return false;
    }
}