class Solution {
    public void sortColors(int[] nums) {
        int i, countZ = 0, countO = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZ++;
            } else if(nums[i] == 1){
                countO++;
            }
        }
        i = 0;
        while(i < nums.length){
            if(i < countZ){
                nums[i] = 0;
            } else if(i < countO + countZ){
                nums[i] = 1;
            } else{
                nums[i] = 2;
            }
            i++;
        }
    }
}