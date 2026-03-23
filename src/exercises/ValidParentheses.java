package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        Stack<Character> parentheses = new Stack<>();

        Map<Character, Character> symbolPairs = new HashMap<>();
        symbolPairs.put('(', ')');
        symbolPairs.put('[', ']');
        symbolPairs.put('{', '}');

        for (char element : s.toCharArray()) {
            if (symbolPairs.containsKey(element)) {
                parentheses.push(element);
            }
            else if (parentheses.isEmpty()) {
                return false;
            } else {
                char firstInPile = parentheses.peek();
                if (symbolPairs.get(firstInPile) == element) {
                    parentheses.pop();
                } else {
                    return false;
                }
            }
        }
        return parentheses.isEmpty();
    }
    public static void main(String[] args) {

        ValidParentheses vp = new ValidParentheses();

        System.out.println(vp.isValid("()"));        // true
        System.out.println(vp.isValid("()[]{}"));    // true
        System.out.println(vp.isValid("(]"));        // false
        System.out.println(vp.isValid("([])"));      // true
        System.out.println(vp.isValid("([)]"));      // false
        System.out.println(vp.isValid("((("));       // false
    }
}