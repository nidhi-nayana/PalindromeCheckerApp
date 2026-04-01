/**
 *
 * MAIN CLASS - PalindromeCheckerApp
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a
 * Singly Linked List.
 *
 * Steps:
 * - Convert string into linked list
 * - Find middle using Fast & Slow pointer
 * - Reverse second half in-place
 * - Compare both halves
 *
 * This demonstrates efficient memory usage
 * and pointer manipulation.
 *
 * @author Nidhi
 * @version 8.0
 */
public class PalindromeCheckerApp {
/**
 * Node class for Singly Linked List
 */
static class Node {
    char data;
    Node next;
    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
    /**
     * Application entry point for UC8.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define input string
        String input = "level";
        // Convert string to linked list
        Node head = null;
        Node tail = null;
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        // Edge case: empty or single character
        if (head == null || head.next == null) {
            System.out.println("Input String : " + input);
            System.out.println("Result : The string is a Palindrome.");
            return;
        }
        // Step 1: Find middle using Fast & Slow pointer
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Step 2: Reverse second half
        Node prev = null;
        Node current = slow;
        while (current != null) {
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        // Step 3: Compare first half and reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;
        boolean isPalindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        // Display result
        System.out.println("Input String : " + input);
        if (isPalindrome) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }
    }
}