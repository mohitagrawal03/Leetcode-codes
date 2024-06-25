// class Solution {
    
//     // Time complexity O(n) and works and good
// //     public String removeOuterParentheses(String s) {
// //         Stack<Character> st = new Stack<>();
// //         StringBuilder ans = new StringBuilder();
// //         for (int i = 0; i < s.length(); i++) {
// //             if (s.charAt(i) == '(') {
// //                 if (!st.empty()) {
// //                     ans.append("(");
// //                 }
                
// //                 st.push('(');
// //             } else {
// //                 st.pop();
                
// //                 if (!st.empty()) {
// //                     ans.append(')');
// //                 }
// //             }
// //         }
        
// //         return ans.toString();
// //     }
    
//     // Little bit better Approach
// //     public String removeOuterParentheses(String S) {
        
// //         StringBuilder ans = new StringBuilder();
// //         int opened = 0, start = 0;
        
// //         for (int i = 0; i < S.length(); i++) {
// //             if (S.charAt(i) == '(') {
// //                 opened++;
// //             } else {
// //                 opened--;
// //             }
// //             if (opened == 0) {
// //                 ans.append(S.substring(start+1, i));
// //                 start = i+1;
// //             }
// //         }
// //         return ans.toString();
// //     }
// }

class Solution {
    public String removeOuterParentheses(String S) {
        
        StringBuilder sb = new StringBuilder();
        int open=0, close=0, start=0;
        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                open++;
            } else if(S.charAt(i) == ')') {
                close++;
            }
            if(open==close) {
                sb.append(S.substring(start+1, i));
                start=i+1;
            }
        }
        return sb.toString();
    }
}