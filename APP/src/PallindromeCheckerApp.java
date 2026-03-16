
public class PallindromeCheckerApp {


    public static void main(String[] args) {
        String input = "madam";   // Hardcoded string
        String reversed = "";

        // Declare and initialize the input string
        input = "radar";

        // Convert the string into a character array
        char[] chars = input.toCharArray();

        // Initialize pointer at beginning
        int start = 0;

        // Initialize pointer at end
        int end = chars.length - 1;

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Continue comparison until pointers cross
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

    }
}