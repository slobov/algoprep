class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int length = nums.length;
        int[] d = new int[length];
        d[0] = nums[0];
        int max = d[0];
        
        for (int i = 1; i < length; i++) {
            d[i] = nums[i] + (d[i-1] > 0 ? d[i-1] : 0);
            max = Math.max(max, d[i]);
        }
        
        return max;
    }
}
