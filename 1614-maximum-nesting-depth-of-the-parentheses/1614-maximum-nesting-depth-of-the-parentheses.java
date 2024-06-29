// class Solution {
//     public int maxDepth(String s) {
//         int opened = 0, max = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(') {
//                max = Math.max(max, ++opened);
//             } else if(s.charAt(i) == ')'){
//                 opened--;
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxDepth(String s) {
        int opened = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // opened++;
                // if (max < opened)
                //     max = opened;
                max = Math.max(max, ++opened);
            } else if (c == ')') {
                opened--;
            }
        }
        return max;
    }
}