class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || k < 1) {
            return;
        }
        
        int numsLength = nums.length;
        int shift = k < numsLength ? k : k % numsLength;
        
        if (shift == 0) {
            // do nothing
        } else {
           int[]  moved = Arrays.copyOfRange(nums, nums.length - shift, nums.length);
           System.arraycopy(nums, 0, nums, shift, nums.length-shift);
           System.arraycopy(moved, 0, nums, 0, moved.length);
        }
        
    }
}