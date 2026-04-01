/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * Measures execution performance of
 * different palindrome algorithms.
 *
 * Uses System.nanoTime() for benchmarking.
 *
 * @author Nishant_Ranjan
 * @version 13.0
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Large test input for better benchmarking
        String input = "madam".repeat(10000);
        // Strategy 1 - Stack
        PalindromeStrategy stackStrategy = new StackStrategy();
        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.check(input);
        long endStack = System.nanoTime();
        long stackDuration = endStack - startStack;
        // Strategy 2 - Two Pointer
        PalindromeStrategy twoPointerStrategy = new TwoPointerStrategy();
        long startTwoPointer = System.nanoTime();
        boolean twoPointerResult = twoPointerStrategy.check(input);
        long endTwoPointer = System.nanoTime();
        long twoPointerDuration = endTwoPointer - startTwoPointer;
        // Display results
        System.out.println("Input length : " + input.length());
        System.out.println("\nStack Strategy Result : " + stackResult);
        System.out.println("Stack Execution Time : " + stackDuration + " ns");
        System.out.println("\nTwo Pointer Result : " + twoPointerResult);
        System.out.println("Two Pointer Time : " + twoPointerDuration + " ns");
        System.out.println("\nPerformance Difference (ns) : " + Math.abs(stackDuration - twoPointerDuration));
    }
}
