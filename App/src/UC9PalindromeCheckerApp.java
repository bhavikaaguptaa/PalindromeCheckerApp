import java.util.Scanner;

public class UC9PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }
        // If characters at start and end don't match, not palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Recursive Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        // Optional: normalize string (ignore case and spaces)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Call recursive function
        boolean result = isPalindrome(normalized, 0, normalized.length() - 1);

        // Output result
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome!");
        }

        sc.close();
    }
}