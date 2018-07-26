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
        int carry = 1;
        
        while (idx >= 0 ) {
            if (carry == 0) {
                return digits;
            }
            int sum = digits[idx] + carry;
            int n = sum % 10;
            carry = sum / 10;
            
            digits[idx] = n;
            idx--;
        }
        
        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, digits.length);
            digits = result;
        }
        
        return digits;
        
    }
}
