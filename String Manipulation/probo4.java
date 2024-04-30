 class WordPresenceChecker {
    public static boolean isWordPresent(String sentence, String word) {
        // Convert both the sentence and the word to lowercase for case-insensitive comparison
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        // Split the sentence into individual words
        String[] words = sentence.split("\\s+");

        // Check each word to see if it matches the target word
        for (String w : words) {
            if (w.equals(word)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String sentence = "This is orange juice";
        String wordToFind = "orange";

        // Check if the word is present in the sentence
        if (isWordPresent(sentence, wordToFind)) {
            System.out.println("The word '" + wordToFind + "' is present in the sentence.");
        } else {
            System.out.println("The word '" + wordToFind + "' is not present in the sentence.");
        }
    }
}
