// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if (n < 1) return false;
//         if (n == 1) return true;
        
//         if (n%4 == 0) return isPowerOfFour(n/4);
        
//         return false;
//     }
// }

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1) return false;
        if (n == 1) return true;
        
        String binary = Integer.toBinaryString(n);
        binary = binary.substring(1, binary.length());
        if(binary.contains("1") || binary.length()%2 != 0) return false;
        return true;
    }
}