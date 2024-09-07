public class StringBuilderClassDemo 
{
    public static void main(String[] args) 
    {
        // Sample StringBuilder for demonstration
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append(String str)
        // Appends the specified string to this character sequence.
        // Time Complexity: O(1) amortized
        sb.append(", World!");
        System.out.println("After append: " + sb.toString()); // Output: Hello, World!

        // 2. insert(int offset, String str)
        // Inserts the specified string at the specified position.
        // Time Complexity: O(n) where n is the number of characters to shift.
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb.toString()); // Output: Hello Java, World!

        // 3. delete(int start, int end)
        // Removes the characters in a substring of this sequence.
        // Time Complexity: O(n) where n is the number of characters to shift.
        sb.delete(5, 10);
        System.out.println("After delete: " + sb.toString()); // Output: Hello, World!

        // 4. replace(int start, int end, String str)
        // Replaces the characters in a substring of this sequence with characters in the specified String.
        // Time Complexity: O(n) where n is the number of characters to shift.
        sb.replace(7, 12, "Universe");
        System.out.println("After replace: " + sb.toString()); // Output: Hello, Universe!

        // 5. reverse()
        // Causes this character sequence to be replaced by the reverse of the sequence.
        // Time Complexity: O(n) where n is the length of the sequence.
        sb.reverse();
        System.out.println("After reverse: " + sb.toString()); // Output: !esrevinU ,olleH

        // 6. toString()
        // Returns a string representing the data in this sequence.
        // Time Complexity: O(n) where n is the length of the sequence.
        String result = sb.toString();
        System.out.println("Final string: " + result); // Output: !esrevinU ,olleH

        // 7. charAt(int index)
        // Returns the char value at the specified index.
        // Time Complexity: O(1)
        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + ch); // Output: s
    }
}

