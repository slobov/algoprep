class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null && t != null || t == null) {
            return false;
        }
        
        if (s.length() != t.length()) {
            return false;
        }
        
        return isAnagram1(s, t);
    }
    
    public static boolean isAnagram1(String s, String t) {
        Map<Character, Integer> charMap = new HashMap<>();
                
        for (int i = 0; i < s.length(); i++) {
            charMap.compute(s.charAt(i), (k, v) -> (v == null) ? 1 : v + 1);
            charMap.compute(t.charAt(i), (k, v) -> (v == null) ? -1 : v - 1);
        }
        
        for (Integer i : charMap.values()) {
            if (i != 0) {
                return false;
            }
        }
        
        return true;
    }
}
