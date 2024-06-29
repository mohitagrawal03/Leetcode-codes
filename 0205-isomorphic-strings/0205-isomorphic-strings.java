class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hmST = new HashMap<>();
        HashMap<Character, Character> hmTS = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (hmST.containsKey(s.charAt(i))) {
                if (hmST.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } if (hmTS.containsKey(t.charAt(i))) {
                if (hmTS.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            } else {
                hmST.put(s.charAt(i), t.charAt(i));
                hmTS.put(t.charAt(i), s.charAt(i));
            }
        }
        
        return true;
    }
}