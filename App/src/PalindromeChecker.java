/**
 *
 * PalindromeChecker Service Class
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class encapsulates the palindrome validation logic.
 *
 * It follows:
 * - Encapsulation
 * - Single Responsibility Principle
 *
 * The class exposes a public method:
 * checkPalindrome()
 *
 * Internal logic uses character comparison.
 *
 * @author Nishant_Ranjan
 * @version 11.0
 */
public class PalindromeChecker {
/**
 * Checks whether a string is a palindrome.
 *
 * @param input Input string
 * @return true if palindrome, otherwise false
 */
public boolean checkPalindrome(String input) {
    if (input == null) {
        return false;
    }
    // Normalize input
    String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
            .toLowerCase();
    int left = 0;
    int right = normalized.length() - 1;
    while (left < right) {
        if (normalized.charAt(left) != normalized.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}
