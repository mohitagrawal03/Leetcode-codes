class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lower case
        s = s.toLowerCase();

        // Use StringBuilder to create a new string with only alphanumeric characters
        StringBuilder ns = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                ns.append(ch);
            }
        }

        // Check if the cleaned string is a palindrome
        int len = ns.length();
        for (int j = 0; j < len / 2; j++) {
            if (ns.charAt(j) != ns.charAt(len - 1 - j)) {
                return false;
            }
        }
        return true;
    }
}