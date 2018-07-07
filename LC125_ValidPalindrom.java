class Solution {    
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return true;
        }
        
        
        
        int startIdx = 0;
        int endIdx = s.length() - 1;
        
        while (startIdx < endIdx) {
            char startChar = s.charAt(startIdx);
            char endChar = s.charAt(endIdx);
            
            if (!Character.isLetterOrDigit(startChar)) {
                startIdx++;
            } else if (!Character.isLetterOrDigit(endChar)) {
                endIdx--;
            } else if (Character.toLowerCase(startChar) == Character.toLowerCase(endChar)) {
                startIdx++;
                endIdx--;
            } else {
                return false;
            }
        }
        
        return true;
    }
}
