/**
 *
 * CLASS: StackStrategy
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Implements palindrome validation using
 * Stack (LIFO principle).
 *
 * Demonstrates algorithm interchangeability.
 *
 * @author Nidhi
 * @version 12.0
 */
import java.util.Stack;
public class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        // Compare with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

