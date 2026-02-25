import java.util.Scanner;

public class UC10PalindromeCheckerApp {

    // Function to check palindrome (simple iterative approach)
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Case-Insensitive & Space-Ignored Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        // Step 1: Normalize string (remove spaces, make lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome
        boolean result = isPalindrome(normalized);

        // Step 3: Output
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome!");
        }

        sc.close();
    }
}