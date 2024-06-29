class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hmST = new HashMap<>();
        HashMap<Character, Character> hmTS = new HashMap<>();
        char sc, tc;
        for (int i = 0; i < s.length(); i++) {
            sc = s.charAt(i); 
            tc = t.charAt(i);
            if ((hmST.containsKey(sc) && hmST.get(sc) != tc) || (hmTS.containsKey(tc) && hmTS.get(tc) != sc)) {
                    return false;
            } else {
                hmST.put(sc, tc);
                hmTS.put(tc, sc);
            }
        }
        
        return true;
    }
}