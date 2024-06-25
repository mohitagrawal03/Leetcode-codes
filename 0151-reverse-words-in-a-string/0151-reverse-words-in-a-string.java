class Solution {
    public String reverseWords(String s) {
        
        // Brute Force
        // String[] arr = s.trim().split("\\s+");
        // StringBuilder sb = new StringBuilder();
        // for (int i = arr.length-1; i > 0; i--) {
        //     sb.append(arr[i]).append(" ");
        // }
        // sb.append(arr[0]);
        // return sb.toString();
        
        // Optimised Approach
        int i = s.length()-1, j = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            if (s.charAt(j) == ' ') {
                i--;
                j--;
            } else if (s.charAt(i) == ' ') {
                sb.append(s.substring(i+1, j+1)).append(" ");
                j = i;
            } else {
                i--;
            }
        }
        
        if (j >= 0) sb.append(s.substring(i+1, j+1));
        if (sb.charAt(sb.length()-1) == ' ') sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
