**Palindrome Checker App**

A console-based Java application that validates whether a given string is a palindrome under different conditions. The app demonstrates core programming concepts, data structures, recursion, and OOP principles in Java.


Use Cases


**_UC1 – Setup Application & Welcome Message_**

Display application name and title.

Display application version.

Show welcome message and brief info about the app.

Confirm application started successfully.


**_UC2 – Hardcoded Palindrome Check_**

Use hardcoded string "madam".

Reverse the string using a loop.

Compare original and reversed string.

Print result using if-else.


**_UC3 – Palindrome Check Using String Reverse_**

Reverse the input string using a loop.

Compare original and reversed string.

Display result.

Concepts used: string immutability, for loop, equals() method, string concatenation.


**_UC4 – Character Array Based Palindrome Check_**

Convert the string into a char[] array.

Use two pointers (start and end) to compare characters.

Display result.

Efficient comparison without creating extra string objects.


**_UC5 – Stack-Based Palindrome Checker_**

Push all characters into a Stack.

Pop characters in reverse order.

Compare with original string.

Display result.

Demonstrates Stack (LIFO) operations and reversal logic.


**_UC6 – Queue + Stack Based Palindrome Check_**

Enqueue characters into a Queue (FIFO).

Push characters into a Stack (LIFO).

Compare dequeue and pop results.

Display result.

Shows difference between FIFO and LIFO structures.


**_UC7 – Deque-Based Optimized Palindrome Check_**

Insert characters into a Deque.

Remove first and last characters iteratively.

Compare characters until Deque is empty.

Display result.

Demonstrates efficient double-ended access with Deque.


**_UC8 – Linked List Based Palindrome Check_**

Convert the input string into a singly linked list.

Find the middle using fast and slow pointers.

Reverse the second half of the list in-place.

Compare the two halves.

Display result.

Demonstrates linked list traversal, in-place reversal, and node manipulation.


**_UC9 – Recursive Palindrome Check_**

Compare start and end characters recursively.

Use base condition to exit recursion.

Display result.

Demonstrates recursion and call stack usage.


**_UC10 – Case-Insensitive & Space-Ignored Palindrome Check_**

Normalize string by removing spaces and converting to lowercase.

Apply two-pointer palindrome logic.

Display result.

Demonstrates string preprocessing and regex usage.


**_UC11 – Object-Oriented Palindrome Service_**

Create a PalindromeChecker class to encapsulate palindrome logic.

Expose a checkPalindrome() method.

Normalize input and apply palindrome logic inside the class.

Display result.

Demonstrates encapsulation and single responsibility principle (OOP).


**_UC12 – Strategy Pattern for Palindrome Algorithms_**

Define a PalindromeStrategy interface.

Implement multiple strategies (e.g., Stack, Deque).

Inject strategy dynamically at runtime.

Display result based on selected strategy.

Demonstrates interface usage, polymorphism, and strategy design pattern.


**_UC13 – Performance Comparison of Palindrome Algorithms_**

Run multiple palindrome algorithms (Iterative, Stack, Recursive).

Capture execution time using System.nanoTime().

Display results for each algorithm.

Compare performance.

Demonstrates benchmarking, performance analysis, and algorithm comparison.
