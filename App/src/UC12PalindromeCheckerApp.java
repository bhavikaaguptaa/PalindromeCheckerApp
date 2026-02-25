import java.util.*;

// Strategy interface
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
        String normalized = str.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }
        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String str) {
        String normalized = str.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

// Context class that uses a strategy
class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String str) {
        return strategy.isPalindrome(str);
    }
}

// Main Application
public class UC12PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Strategy Pattern Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        System.out.println("Choose algorithm: 1. Stack  2. Deque");
        int choice = sc.nextInt();

        PalindromeStrategy strategy;
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeContext context = new PalindromeContext(strategy);
        boolean result = context.checkPalindrome(input);

        if (result) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome!");
        }

        sc.close();
    }
}