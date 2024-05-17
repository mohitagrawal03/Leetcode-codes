class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int minIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < strs[minIndex].length()) {
                minIndex = i;
            }
        }
        String minString = strs[minIndex];
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < minString.length(); i++) {
            boolean same = true;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != minString.charAt(i)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                commonPrefix.append(minString.charAt(i));
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }
}
