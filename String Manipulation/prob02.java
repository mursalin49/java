import java.util.Scanner;

public class prob02 {
    public static void printEvenLengthWords(String input) {
        // Split the input string by space to get individual words
        String[] words = input.split("\\s+");

        System.out.println("Even length words:");
        // Iterate through each word
        for (String word : words) {
            // Check if the length of the word is even
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to print even-length words
        printEvenLengthWords(input);

        scanner.close();
    }
}
