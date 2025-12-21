package week1;

public class palindrome {
    public static void main(String[] args) {
        int number = 123421;

        int originalNumber = number;
        int reversedNumber = 0;
        int remainder;

        // Logic to reverse the number
        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Output: Display if the number is Palindrome or not
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome.");
        }

    }
}
