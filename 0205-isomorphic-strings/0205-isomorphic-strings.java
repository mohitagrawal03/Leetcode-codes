// Works but very poor T.C.

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character, Character> hmST = new HashMap<>();
//         HashMap<Character, Character> hmTS = new HashMap<>();
//         char sc, tc;
//         for (int i = 0; i < s.length(); i++) {
//             sc = s.charAt(i); 
//             tc = t.charAt(i);
//             if (hmST.containsKey(sc)) {
//                 if (hmST.get(sc) != tc) {
//                     return false;
//                 }
//             } if (hmTS.containsKey(tc)) {
//                 if (hmTS.get(tc) != sc) {
//                     return false;
//                 }
//             } else {
//                 hmST.put(sc, tc);
//                 hmTS.put(tc, sc);
//             }
//         }
        
//         return true;
//     }
// }

// Efficient Approach T.C. O(n)

// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character, Character> hm = new HashMap<>();
        
//         for (int i = 0; i < s.length(); i++) {
//             char sc = s.charAt(i), tc = t.charAt(i);
            
//             if (!hm.containsKey(sc)) {
//                 if (!hm.containsValue(tc)) {
//                     hm.put(sc, tc);
//                 } else {
//                     return false;
//                 }
//             } else if (hm.get(sc) != tc) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// Best Approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] st = new int[256];
        int[] ts = new int[256];
        Arrays.fill(st, -1);
        Arrays.fill(ts, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            if (st[sc] == -1 && ts[tc] == -1) {
                st[sc] = tc;
                ts[tc] = sc;
            } else if (st[sc] != tc || ts[tc] != sc) {
                return false;
            }
        }
        return true;
    }
}