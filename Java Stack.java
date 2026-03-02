import java.util.*;
import java.io.*;

class Solution {
    
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
    
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            // If it's an opening bracket, push to stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            } 
            // If it's a closing bracket
            else {
                // If stack is empty, there is no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                // Check if the popped bracket matches the current closing one
                if (current == ')' && top != '(') return false;
                if (current == '}' && top != '{') return false;
                if (current == ']' && top != '[') return false;
            }
        }
        
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}




