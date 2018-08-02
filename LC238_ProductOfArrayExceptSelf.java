class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        
        int zeroIndex = -1;
        int zeroCounter = 0;
        int tempResult = 1;
        
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                zeroIndex = i;
                zeroCounter++;
                continue;
            }
            tempResult *= nums[i];
        }
        
        int[] output = new int[length];
            
        if (zeroCounter > 1) {
            return output;
        }
        
        if (zeroCounter == 1) {
            output[zeroIndex] = tempResult;
            return output;
        }
        
        for (int i = 0; i < length; i++) {         
            output[i] = tempResult / nums[i];
        }
        
        return output;
    }
}
