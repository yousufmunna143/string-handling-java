import java.util.*;

public class StringClassDemo 
{
    public static void main(String[] args) 
    {
        // Sample string for demonstration
        String str = "Hello, World!";

        // 1. length()
        // Returns the length of the string.
        // Time Complexity: O(1)
        int length = str.length();
        System.out.println("Length: " + length); // Output: 13

        // 2. charAt(int index)
        // Returns the character at the specified index.
        // Time Complexity: O(1)
        char ch = str.charAt(5);
        System.out.println("Character at index 5: " + ch); // Output: W

        // 3. substring(int beginIndex, int endIndex)
        // Returns a new string that is a substring of this string.
        // Time Complexity: O(n) where n is the length of the substring.
        String sub = str.substring(7, 12);
        System.out.println("Substring (7, 12): " + sub); // Output: World

        // 4. equals(Object anObject)
        // Compares this string to the specified object.
        // Time Complexity: O(n) where n is the length of the string.
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Equals 'Hello, World!': " + isEqual); // Output: true

        // 5. indexOf(String str)
        // Returns the index within this string of the first occurrence of the specified substring.
        // If substring is not found, then it returns -1
        // Time Complexity: O(n) where n is the length of the string.
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index); // Output: 7

        // 6. toLowerCase()
        // Converts all of the characters in this string to lower case.
        // Time Complexity: O(n) where n is the length of the string.
        String lower = str.toLowerCase();
        System.out.println("Lower case: " + lower); // Output: hello, world!

        // 7. toUpperCase()
        // Converts all of the characters in this string to upper case.
        // Time Complexity: O(n) where n is the length of the string.
        String upper = str.toUpperCase();
        System.out.println("Upper case: " + upper); // Output: HELLO, WORLD!

        // 8. replace(char oldChar, char newChar)
        // Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
        // Time Complexity: O(n) where n is the length of the string.
        String replaced = str.replace('o', 'a');
        System.out.println("Replaced 'o' with 'a': " + replaced); // Output: Hella, Warld!

        // 9. split(String regex)
        // Splits this string around matches of the given regular expression.
        // Time Complexity: O(n) where n is the length of the string.
        String[] parts = str.split(", ");
        System.out.println("Split by ', ': " + Arrays.toString(parts)); // Output: [Hello, World!]

        // 10. trim()
        // Returns a copy of the string, with leading and trailing whitespace omitted.
        // Time Complexity: O(n) where n is the length of the string.
        String trimmed = "          hey       bro       ".trim();
        System.out.println("Trimmed: " + trimmed); // Output: Hello, World!

        // 11. + operator
        // Concatenates two strings.
        // Time Complexity: O(n) where n is the length of the resulting string.
        String concatenated = str + " How are you?";
        System.out.println("Concatenated with +: " + concatenated); // Output: Hello, World! How are you?

        // 12. concat(String str)
        // Concatenates the specified string to the end of this string.
        // Time Complexity: O(n) where n is the length of the resulting string.
        String concatenatedWithConcat = str.concat(" How are you?");
        System.out.println("Concatenated with concat(): " + concatenatedWithConcat); // Output: Hello, World! How are you?        
    }
}
