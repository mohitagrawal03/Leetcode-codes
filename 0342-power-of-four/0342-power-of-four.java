// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if (n < 1) return false;
//         if (n == 1) return true;
        
//         if (n%4 == 0) return isPowerOfFour(n/4);
        
//         return false;
//     }
// }

// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if (n < 1) return false;
//         if (n == 1) return true;
        
//         String binary = Integer.toBinaryString(n);
//         binary = binary.substring(1, binary.length());
//         if(binary.contains("1") || binary.length()%2 != 0) return false;
//         return true;
//     }
// }

// class Solution {
//     public boolean isPowerOfFour(int n) {
//         return (n > 0) && (n & n-1) == 0 && Integer.toBinaryString(n).length() % 2 != 0;
//     }
// }

class Solution {
     public boolean isPowerOfFour(int n) {
         if (n < 1) return false;
         
         double logBase4 = Math.log(n)/Math.log(4);
         
         return logBase4 == (int)logBase4;
     }
}

// public boolean isPowerOfFour(int n) {
//        if(n<=0) return false;
//        if((n&(n-1))!=0) return false;
//         return (n-1)%3==0;
//     }