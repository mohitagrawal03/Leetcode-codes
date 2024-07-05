// RECURSION
// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n < 1) return false;
//         if (n == 1 || n == 2) return true;
        
//         if (n%2 == 0) {
//             return isPowerOfTwo(n/2);
//         } else{
//             return false;
//         }
//     }
// }

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        
        String binary = Integer.toBinaryString(n);
        binary = binary.substring(1, binary.length());
        if (binary.contains("1")) return false;
        return true;
    }
}