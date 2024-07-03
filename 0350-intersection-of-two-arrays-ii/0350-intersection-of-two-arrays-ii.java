class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    list.add(nums2[j]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        
        int[] ans = new int[list.size()];
        int i = 0;
        for(int num : list) {
            ans[i++] = num;
        }
        
        return ans;
    }
}