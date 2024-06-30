// Works and T.C. O(n) but for loop could be wriiten in better manner.
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;
        
//         int[] count = new int[26];
        
//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }
//         for (int i = 0; i < 26; i++) {
//             if (count[i] != 0) return false;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] count = new int[26];
        
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if(i != 0) return false;
        }
        return true;
    }
}