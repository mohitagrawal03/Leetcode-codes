class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length-1;
        int m;
        
        while (l<=h) {
            m = (l+h)/2;
            
            if ((m-1 != -1 ? nums[(m-1)] != nums[m] : true) && (m+1 != nums.length ? nums[(m+1)] != nums[m] : true)) return nums[m];
            
            if (nums[m-1] == nums[m]) {
                if ((m-0)%2 == 0) {
                    h = m-1;
                } else {
                    l = m+1;
                }
            } else {
                if ((nums.length-1-m)%2 == 0) {
                    l = m+1;
                } else {
                    h = m-1;
                }
            }
        }
        
        return 0; // No use
    }
}