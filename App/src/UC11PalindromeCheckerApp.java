import java.util.Scanner;

// Encapsulated Palindrome Service
class PalindromeChecker {

    private String input;  // internal data

    // Constructor
    public PalindromeChecker(String input) {
        this.input = input;
    }

    // Public method to check if string is palindrome
    public boolean checkPalindrome() {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// Main Application
public class UC11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Object-Oriented Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Use checkPalindrome() method
        if (checker.checkPalindrome()) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome!");
        }

        sc.close();
    }
}