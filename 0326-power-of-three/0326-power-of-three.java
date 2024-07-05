// class Solution {
//     public boolean isPowerOfThree(int n) {
//         if (n < 1) return false;
//         if (n == 1 || n == 3) return true;
        
//         if (n%9 == 0) return isPowerOfThree(n/3);
        
//         return false;
//     }
// }

// class Solution {
//     public boolean isPowerOfThree(int n) {
//         if (n < 1) return false;
//         if (n == 1) return true;
        
//         if (n%3 == 0) return isPowerOfThree(n/3);
        
//         return false;
//     }
// }

class Solution {
    public boolean isPowerOfThree(int n) {
    // 1162261467 is 3^19,  3^20 is bigger than int (works for prime numbers)  
    return ( n>0 &&  1162261467%n==0);
    }
}