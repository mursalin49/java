import java.util.Scanner;

public class Palindrome {
    private int number;

    // Constructor
    public Palindrome() {
        this.number = 0;
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        this.number = scanner.nextInt();
    }

    // Function to check if the number is a palindrome
    public boolean isPalindrome() {
        int originalNumber = this.number;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        return this.number == reversedNumber;
    }

    public static void main(String[] args) {
        Palindrome palindromeObject = new Palindrome();
        palindromeObject.getInput();

        if (palindromeObject.isPalindrome()) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
