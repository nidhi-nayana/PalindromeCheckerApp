/**
 *
 * INTERFACE: PalindromeStrategy
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Defines a common contract for all palindrome
 * checking algorithms.
 *
 * Any new algorithm must implement this interface.
 *
 * @author Nidhi
 * @version 12.0
 */
public interface PalindromeStrategy {
    /**
     * Checks if input string is palindrome.
     *
     * @param input Input string
     * @return true if palindrome, otherwise false
     */
    boolean check(String input);
}