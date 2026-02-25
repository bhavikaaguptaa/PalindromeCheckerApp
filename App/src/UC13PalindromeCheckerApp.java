import java.util.*;
import java.util.concurrent.TimeUnit;

// Interface for different palindrome strategies
interface PalindromeAlgorithm {
    boolean isPalindrome(String str);
}

// Stack-based palindrome
class StackAlgorithm implements PalindromeAlgorithm {
    public boolean isPalindrome(String str) {
        String normalized = str.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }
}

// Iterative two-pointer palindrome
class IterativeAlgorithm implements PalindromeAlgorithm {
    public boolean isPalindrome(String str) {
        String normalized = str.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}

// Recursive palindrome
class RecursiveAlgorithm implements PalindromeAlgorithm {
    public boolean isPalindrome(String str) {
        String normalized = str.replaceAll("\\s+", "").toLowerCase();
        return check(normalized, 0, normalized.length() - 1);
    }

    private boolean check(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return check(str, start + 1, end - 1);
    }
}

// Main Application
public class UC13PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Performance Comparison ===");
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        // List of algorithms
        List<PalindromeAlgorithm> algorithms = Arrays.asList(
                new IterativeAlgorithm(),
                new StackAlgorithm(),
                new RecursiveAlgorithm()
        );

        String[] names = {"Iterative Two-Pointer", "Stack Approach", "Recursive Approach"};

        // Run algorithms and measure time
        for (int i = 0; i < algorithms.size(); i++) {
            PalindromeAlgorithm alg = algorithms.get(i);

            long startTime = System.nanoTime();
            boolean result = alg.isPalindrome(input);
            long endTime = System.nanoTime();

            long duration = endTime - startTime; // nanoseconds
            System.out.println("\nAlgorithm: " + names[i]);
            System.out.println("Result   : " + (result ? "Palindrome" : "Not Palindrome"));
            System.out.println("Time     : " + duration + " ns (" +
                    TimeUnit.NANOSECONDS.toMillis(duration) + " ms approx.)");
        }

        sc.close();
    }
}