 class LexicographicComparison {
    public static boolean areLexicographicallyEqual(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters at each position
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        // If all characters are the same, return true
        return true;
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        // Check if the strings are lexicographically equal
        if (areLexicographicallyEqual(str1, str2)) {
            System.out.println("Strings are lexicographically equal.");
        } else {
            System.out.println("Strings are not lexicographically equal.");
        }
    }
}
