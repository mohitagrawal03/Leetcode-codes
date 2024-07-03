// Not so good T.C., Theoritically I think O(n) hi hai but actually (1000n) something
// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         List<Integer> ans = new ArrayList<>();

//         for (int i = 0; i <= 1000; i++) {
//             boolean bol1 = false, bol2 = false;
//             for (int j = 0; j < nums1.length; j++) { 
//                 if (nums1[j] == i) {
//                     bol1 = true;
//                 }
//             }
//             for (int j = 0; j < nums2.length; j++) { 
//                 if (nums2[j] == i) {
//                     bol2 = true;
//                 }
//             }
//             if (bol1 && bol2) {
//                 ans.add(i);
//             }
//         }
//         int[] array = new int[ans.size()];
//         for (int i = 0; i < ans.size(); i++) {
//             array[i] = ans.get(i);
//         }
//         return array;
//     }
// }

// T.C. = O(n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++) {
           set.add(nums1[i]); 
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        
        int[] ans = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            ans[i++] = num;
        }
        
        return ans;
    }
}
