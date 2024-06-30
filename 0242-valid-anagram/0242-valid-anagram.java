// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;
        
//         int[] ss = new int[26];
        
//         for (int i = 0; i < s.length(); i++) {
//             ss[s.charAt(i) - 'a']++;
//             ss[t.charAt(i) - 'a']--;
//         }
//         for (int i = 0; i < 26; i++) {
//             if (ss[i] != 0) return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        
        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }
        
        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }
        
        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        
        return true;
    }
}