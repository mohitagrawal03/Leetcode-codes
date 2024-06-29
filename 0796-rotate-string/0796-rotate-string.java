// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if (s == goal) {
//             return true;
//         }
//         StringBuilder sb = new StringBuilder(s);
//         for (int i = 1; i < s.length(); i++) {
//             sb.append(s.charAt(0));
//             sb.deleteCharAt(0);
            
//             if(sb.toString().equals(goal)) {
//                 return true;
//             }
//         }
        
//         return false;
//     }
// }

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        // Concatenate s with itself and check if goal is a substring
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
