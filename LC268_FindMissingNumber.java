
// sum = n * (n + 1)/2
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        
        int result = sum;
        
        for (int i = 0; i < n; i++) {
            result -= nums[i];
        }
        
        // // for-each is much slower due to auto-inboxing
        // for (Integer i : nums) {
        //     result -= i;
        // }
        
        return result;
        
    }
}
