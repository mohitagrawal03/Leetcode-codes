class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm =  new HashMap<>();
        Integer ans = -1;
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
                if (hm.get(nums[i]) > max) {
                    ans = nums[i];
                    max = hm.get(nums[i]);
                } else if (hm.get(nums[i]) == max && nums[i] < ans) {
                    ans = nums[i];
                    max = hm.get(nums[i]);
                }
            }
        }
        return ans;
    }
}