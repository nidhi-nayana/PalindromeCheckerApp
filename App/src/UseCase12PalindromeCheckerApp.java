/**
 *
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Demonstrates dynamic algorithm selection
 * using Strategy Design Pattern.
 *
 * No performance comparison.
 * Focus: Clean extensible design.
 *
 * @author Nishant_Ranjan
 * @version 12.0
 */
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);
        System.out.println("Input : " + input);
        if (result) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }
    }
}
