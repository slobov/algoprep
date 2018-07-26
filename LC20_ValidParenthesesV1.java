import java.util.Deque;
import java.util.ArrayDeque;

// use stack to store (push) all the open brackets
// if close bracket - check if stack is empty:
//  - if empty - return false (invalid - no matching open bracket)
//  - if not - remove first (top of the stack):
//      - if not match - return false
//      - if match - continue

class Solution {
    private static Map<Character, Character> CLOSE_TO_OPEN_BRACKET_MAP = 
        new HashMap<>();
    
    static {
       CLOSE_TO_OPEN_BRACKET_MAP.put('}', '{');
       CLOSE_TO_OPEN_BRACKET_MAP.put(')', '(');
       CLOSE_TO_OPEN_BRACKET_MAP.put(']', '[');
        
    }
        
    private static final Set<Character> CLOSE_BRACKETS = 
        CLOSE_TO_OPEN_BRACKET_MAP.keySet(); 
    
    private static final Set<Character> OPEN_BRACKETS = 
        new HashSet(CLOSE_TO_OPEN_BRACKET_MAP.values()); 
    
    private static boolean isCloseBracket(char bracket) {
        return CLOSE_BRACKETS.contains(bracket);
    }
    
    private static boolean isOpenBracket(char bracket) {
        return OPEN_BRACKETS.contains(bracket);
    }
    
    public boolean isValid(String s) {
        Deque stack = new ArrayDeque();
        
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (isCloseBracket(bracket)) {
                if (stack.isEmpty() || 
                    CLOSE_TO_OPEN_BRACKET_MAP.get(bracket) != stack.removeFirst()) {
                    return false;
                } 
            } else if (isOpenBracket(bracket)) {
                stack.addFirst(bracket);
            }      
        }
        
        return stack.isEmpty();
    }
}
