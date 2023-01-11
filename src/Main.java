public class Main {
    public static void main(String[] args) {
        // Checks if -1221 is a palindrome.
        System.out.println(isPalindrome(-1221));

        // Checks if 707 is a palindrome.
        System.out.println(isPalindrome(707));

        // Checks if 11212 is a palindrome.
        System.out.println(isPalindrome(11212));
    }

    /**
     * Checks if a number is a palindrome.
     */
    public static boolean isPalindrome(int number) {
        // Checks if user entered 0.
        if (number == 0) {
            return true;
        }

        // Stores the original number.
        int copiedNumber = number;

        // Stores the number of digits in the number.
        int digit = 0;

        // Stores the reverse number.
        int reverseNumber = 0;

        // Calculates the number of digits inside variable number.
        while (number != 0) {
            digit++;
            number /= 10;
        }

        // Restoring the copy.
        number = copiedNumber;

        // Stores the original number of digits.
        int copiedDigits = digit;

        // Forms the reverse number.
        for (int i = 0; i < digit; i++) {
            int lastDigitOfOriginal = copiedNumber % 10;
            int ten = 1;
            for (int j = 1; j < copiedDigits; j++) {
                ten *= 10;
            }
            reverseNumber += lastDigitOfOriginal * ten;
            copiedDigits--;
            copiedNumber /= 10;
        }
        return reverseNumber == number;
    }
}