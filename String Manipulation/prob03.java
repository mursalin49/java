import java.util.Scanner;

class ReplaceCharacterAtIndex {
    public static String replaceCharAtIndex(String input, int index, char newChar) {
        // Convert the input string to a character array
        char[] charArray = input.toCharArray();

        // Check if the index is within the bounds of the string
        if (index >= 0 && index < charArray.length) {
            // Replace the character at the specified index
            charArray[index] = newChar;
        } else {
            System.out.println("Index out of bounds.");
        }

        // Convert the character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the index of the character to replace: ");
        int index = scanner.nextInt();

        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);

        // Call the method to replace the character at the specified index
        String result = replaceCharAtIndex(input, index, newChar);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
