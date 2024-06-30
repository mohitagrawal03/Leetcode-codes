class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] ss = new int[256];
        int[] tt = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            ss[s.charAt(i)]++;
            tt[t.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (ss[i] != tt[i]) return false;
        }
        return true;
    }
}