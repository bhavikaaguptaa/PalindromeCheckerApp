import java.util.Scanner;

public class UCgit push origin UC3-ReverseStringPalindrome3PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Palindrome Checker App");
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse the string using loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("The given string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + original + "\" is NOT a Palindrome.");
        }

        sc.close();
    }
}