class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // Good Approach and Consider it.
//         List<Integer> list = new ArrayList<>();
        
//         for (int i = 0; i < nums1.length; i++) {
//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums2[j] == nums1[i]) {
//                     list.add(nums2[j]);
//                     nums2[j] = -1;
//                     break;
//                 }
//             }
//         }
        
//         int[] ans = new int[list.size()];
//         int i = 0;
//         for(int num : list) {
//             ans[i++] = num;
//         }
        
//         return ans;
        
        // Follow Up: if arrays are sorted.
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         List<Integer> list = new ArrayList<>();
//         int i = 0, j = 0;
//         while (i < nums1.length && j < nums2.length) {
//             if (nums1[i] == nums2[j]) {
//                 list.add(nums1[i]);
//                 i++;
//                 j++;
//             } else if (nums1[i] < nums2[j]) {
//                 i++;
//             } else {
//                 j++;
//             }
//         }
        
//         int[] ans = new int[list.size()];
//         i = 0;
//         for(int num : list) {
//             ans[i++] = num;
//         }
        
//         return ans;
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int num : nums2) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                list.add(num);
                freq.put(num, freq.get(num)-1);
            }
        }
        
        int[] ans = new int[list.size()];
        
        for(int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}