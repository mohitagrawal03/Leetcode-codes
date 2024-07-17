// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if (s.length() <= 1) return s.length();
//         HashSet<Character> letters = new HashSet<>();
//         int i = 0, j = -1;
//         letters.add(s.charAt(i));
//         int max = 1;
//         i++;
//         while (i < s.length()) {
//             if (!letters.contains(s.charAt(i))) {
//                 letters.add(s.charAt(i));
//                 max = Math.max(max, i-j);
//                 i++;
//             } else if (j == -1 || s.charAt(j) != s.charAt(i)) {
//                 j++;
//                 letters.remove(s.charAt(j));
//             }
//         }
        
//         return Math.max(max, i-j);
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // BRUTE FORCE
//         if (s.length() <= 1) return s.length();
        
//         HashSet<Character> letters = new HashSet<>();
//         int i = 0, j = 0;  // Initialize j to 0
//         int max = 0;       // Initialize max to 0
        
//         while (i < s.length()) {
//             if (!letters.contains(s.charAt(i))) {
//                 letters.add(s.charAt(i));
//                 max = Math.max(max, i - j + 1); // Calculate the max length
//                 i++;
//             } else {
//                 letters.remove(s.charAt(j));
//                 j++;
//             }
//         }
        
//         return max;
        
        // 2 Pointer Approach
        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0, r = 0, maxlen = 0;
        
        while (r < s.length()) {
            if (!hm.containsKey(s.charAt(r)) || hm.get(s.charAt(r)) < l) {
                maxlen = Math.max(maxlen, r-l+1);
                hm.put(s.charAt(r), r);
                r++;
            } else {
                    l = hm.get(s.charAt(r))+1;
            }
        }
        
        return maxlen;
    }
}
