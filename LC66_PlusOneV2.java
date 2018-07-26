// use cases:
// [] + 1 -> [1]
// [0] + 1 -> [1]
// [1, 2, 3] + 1 -> [1, 2, 4]
// [9, 9, 9] + 1 -> [1, 0, 0, 0]

// How to maintain carry value
// What should be done if we need to carry from the most significant digit:
// - create new "result "array with (digits.length + 1) length.
// - if there is a carry from significant one - return result array
// - else return result subarray (from 1 to result.length-1)

class Solution {
    public int[] plusOne(int[] digits) {

        int idx = digits.length - 1; 
        while (idx >= 0) {
            if (digits[idx] < 9) {
                digits[idx]++;
                return digits;
            }
            digits[idx] = 0;
            idx--;
        }
        
        int[] result = new int[digits.length + 1]; // default array val is 0
        result[0] = 1;
        return result;
        
    }
}
