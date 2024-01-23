import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Call the method to convert decimal to binary
        String binaryRepresentation = convertDecimalToBinary(decimalNumber);

        // Display the result
        System.out.println("Binary representation: " + binaryRepresentation);

        // Close the scanner
        scanner.close();
    }

    // Method to convert decimal to binary
    private static String convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binary.toString();
    }
}
