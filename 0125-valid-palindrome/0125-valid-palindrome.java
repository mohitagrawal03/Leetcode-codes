class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        StringBuilder ns = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                ns.append(s.charAt(i));
            }
        }
        
        for (int i = 0; i < ns.length() / 2; i++) {
            if (ns.charAt(i) != ns.charAt(ns.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}