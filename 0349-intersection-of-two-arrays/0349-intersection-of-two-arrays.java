// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
        
//         List<Integer> ans = new ArrayList<>();
        
//         for (int i = 0; i <= 1000; i++) {
//             boolean bol1 = false, bol2 = false;
//             for (int j = 0; i < nums1.length; i++ ) {
//                 if (nums1[j] == i) {
//                     bol1 = true;
//                 }
//             }
//             for (int j = 0; i < nums2.length; i++ ) {
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

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= 1000; i++) {
            boolean bol1 = false, bol2 = false;
            for (int j = 0; j < nums1.length; j++) {  // Use 'j' and correct condition
                if (nums1[j] == i) {
                    bol1 = true;
                }
            }
            for (int j = 0; j < nums2.length; j++) {  // Use 'j' and correct condition
                if (nums2[j] == i) {
                    bol2 = true;
                }
            }
            if (bol1 && bol2) {
                ans.add(i);
            }
        }
        int[] array = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            array[i] = ans.get(i);
        }
        return array;
    }
}
