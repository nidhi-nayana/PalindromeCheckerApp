/**
 *
 * CLASS: TwoPointerStrategy
 *
 * Implements palindrome validation using
 * two-pointer technique.
 *
 * Generally faster than Stack because
 * no extra memory is used.
 *
 * @author Nidhi
 * @version 13.0
 */
public class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) {
            return false;
        }
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
