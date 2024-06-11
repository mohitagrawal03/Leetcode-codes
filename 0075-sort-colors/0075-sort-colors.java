// class Solution {
//     public void sortColors(int[] nums) {
        
//         // I think it is Two Pass roughly the same T.C. of O(n) more precisely 2n = n
//         // int i, countZ = 0, countO = 0;
//         // for(i = 0; i < nums.length; i++){
//         //     if(nums[i] == 0){
//         //         countZ++;
//         //     } else if(nums[i] == 1){
//         //         countO++;
//         //     }
//         // }
//         // i = 0;
//         // while(i < nums.length){
//         //     if(i < countZ){
//         //         nums[i] = 0;
//         //     } else if(i < countO + countZ){
//         //         nums[i] = 1;
//         //     } else{
//         //         nums[i] = 2;
//         //     }
//         //     i++;
//         // }
//     }
// }

// Dutch National Flag Algo (one pass)

class Solution{
    public void sortColors(int[] nums){
        int l = 0, m = 0, h = nums.length - 1;
        while(m <= h){
            if(nums[m] == 0){
                swap(nums, l, m);
                l++;
                m++;
            } else if(nums[m] == 1){
               m++; 
            } else{
                swap(nums, m, h);
                h--;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}