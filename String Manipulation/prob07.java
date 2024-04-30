import java.util.HashMap;
import java.util.Map;

 class LongestSubstringLength {
    public static int findLongestSubstringLength(String s) {
        int maxLength = 0;
        int startIndex = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);

            if (charIndexMap.containsKey(currentChar)) {
                startIndex = Math.max(startIndex, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";

        int longestLength = findLongestSubstringLength(input);
        System.out.println("Length of the longest substring without repeating characters: " + longestLength);
    }
}
