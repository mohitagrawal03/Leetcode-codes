class Solution {
    public static void reverse(int i,int j, int[] a){
        while(j>i){
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(0, nums.length-1-k, nums);
        reverse(nums.length-k, nums.length-1, nums);
        reverse(0, nums.length-1, nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}