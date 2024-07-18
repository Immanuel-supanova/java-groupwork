import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:");
        
        String numberText = scanner.nextLine();

        // Check if the input number is a palindrome and print the result
        if (isPalindrome(numberText)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

        // Close the scanner 
        scanner.close();
    }

    /**
     * Method to check if a given string is a palindrome.
     */
    private static boolean isPalindrome(String numberText) {
        int length = numberText.length();

        // Compare characters from the beginning and end moving towards center
        for (int i = 0; i < length / 2; i++) {
            if (numberText.charAt(i) != numberText.charAt(length - 1 - i)) {
                return false;
            }
        }

        // If all characters match, it is a palindrome
        return true;
    }
}

