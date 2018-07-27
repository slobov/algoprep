class Solution {
    public String reverseString(String s) {
        //return reverseString1(s);
        //return reverseString2(s);
        return reverseString3(s);
    }
    
    public static String reverseString1(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    public static String reverseString2(String s) {
        StringBuilder builder = new StringBuilder();
        
        for(int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        
        return builder.toString();
    }
    
    public static String reverseString3(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            char startChar = arr[start];
            arr[start] = arr[end];
            arr[end] = startChar;
            start++;
            end--;
                
        }
        
        return new String(arr);
    }
}
