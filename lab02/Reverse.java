import java.util.Scanner;

public class Reverse {
    private int number;

    // Constructor
    public Reverse() {
        this.number = 0;
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        this.number = scanner.nextInt();
    }

    // Function to reverse the integer
    public void doReverse() {
        int reversedNumber = 0;
        int originalNumber = this.number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }

    public static void main(String[] args) {
        Reverse reverseObject = new Reverse();
        reverseObject.getInput();
        reverseObject.doReverse();
    }
}
