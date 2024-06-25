// class Solution {
//     public String reverseWords(String s) {
//         String[] arr = s.trim().split("\\s+");
//         StringBuilder sb = new StringBuilder();
//         for (int i = arr.length-1; i > 0; i--) {
//             sb.append(arr[i]).append(" ");
//         }
//         sb.append(arr[0]);
//         return sb.toString();
//     }
// }

class Solution {
    public String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }
}