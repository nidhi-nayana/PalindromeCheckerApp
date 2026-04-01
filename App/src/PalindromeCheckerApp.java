/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * Demonstrates encapsulation by delegating palindrome
 * logic to PalindromeChecker class.
 *
 * @author Nishant_Ranjan
 * @version 11.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        // Create service object
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);
        System.out.println("Input : " + input);
        if (result) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }
    }
}