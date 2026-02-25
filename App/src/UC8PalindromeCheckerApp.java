import java.util.Scanner;

// Node class for singly linked list
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List class
class LinkedList {
    Node head;

    // Add character to linked list
    public void add(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Print linked list (optional, for debugging)
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class UC8PalindromeCheckerApp {

    // Function to reverse a linked list starting from given node
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Function to check if linked list is palindrome
    public static boolean isPalindrome(LinkedList list) {
        if (list.head == null || list.head.next == null) {
            return true;
        }

        // Step 1: Find middle using slow/fast pointers
        Node slow = list.head;
        Node fast = list.head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalfStart = reverse(slow.next);

        // Step 3: Compare first half and reversed second half
        Node firstHalfStart = list.head;
        Node secondHalfIter = secondHalfStart;
        boolean palindrome = true;
        while (secondHalfIter != null) {
            if (firstHalfStart.data != secondHalfIter.data) {
                palindrome = false;
                break;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfIter = secondHalfIter.next;
        }

        // Step 4: Restore the list (optional)
        slow.next = reverse(secondHalfStart);

        return palindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Linked List Palindrome Checker ===");
        System.out.print("Enter a string to check: ");
        String input = sc.nextLine();

        // Create linked list from input string
        LinkedList list = new LinkedList();
        for (char ch : input.toCharArray()) {
            list.add(ch);
        }

        // Check palindrome
        if (isPalindrome(list)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome!");
        }

        sc.close();
    }
}