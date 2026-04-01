/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Nidhi
 * @version 9.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define input string
        String input = "madam";
        // Call recursive method
        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);
        // Display result
        System.out.println("Input String : " + input);
        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }
    }
    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param str Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean checkPalindrome(String str, int start, int end) {
        // Base Condition 1: If start >= end, all characters matched
        if (start >= end) {
            return true;
        }
        // If characters do not match, stop recursion
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call moving inward
        return checkPalindrome(str, start + 1, end - 1);
    }
}