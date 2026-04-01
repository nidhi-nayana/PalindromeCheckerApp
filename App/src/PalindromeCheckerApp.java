/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical
 * rather than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Nidhi
 * @version 10.0
 */
public class PalindromeCheckerApp {
/**
 * Application entry point for UC10.

 * @param args Command-line arguments
 */
public static void main(String[] args) {
    // Original input string
    String input = "A man a plan a canal Panama";
    // Step 1: Normalize string
    // Remove all non-alphanumeric characters using regex
    String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
            .toLowerCase();
    // Flag to track palindrome result
    boolean isPalindrome = true;
    // Step 2: Compare characters from both ends
    for (int i = 0; i < normalized.length() / 2; i++) {
        // Compare symmetric characters
        if (normalized.charAt(i) !=
                normalized.charAt(normalized.length() - 1 - i)) {
            isPalindrome = false;
            break;
        }
    }
    // Display results
    System.out.println("Original Input : " + input);
    System.out.println("Normalized Input : " + normalized);
    if (isPalindrome) {
        System.out.println("Result : The string is a Palindrome.");
    } else {
        System.out.println("Result : The string is NOT a Palindrome.");
    }
}
}
