class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        if (n == 1 || n == 3) return true;
        
        if (n%9 == 0) return isPowerOfThree(n/3);
        
        return false;
    }
}