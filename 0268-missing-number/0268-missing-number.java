class Solution {
    public int missingNumber(int[] nums) {
        
        // This one method and nothing wrong in it with right time and space comp.
//         //int n = nums.length;
//         int s = (nums.length*(nums.length+1))/2; // sum of n natural nos.
//         int sDash = 0;
//         for(int i = 0; i < nums.length; i++){
//             sDash += nums[i];
//         }
        
//         return s - sDash;
        
        // Just a minute update in upper code
        // public int missingNumber(int[] nums) { //sum
        // int len = nums.length;
        // int sum = (0+len)*(len+1)/2;
        // for(int i=0; i<len; i++)
        //     sum-=nums[i];
        // return sum;
        // }
        
        // Approach Two
        int xor = 0, i = 0;
        for(i = 0; i < nums.length; i++){
            xor ^= i ^ nums[i];
        }
        
        return xor ^ i;
    }
}