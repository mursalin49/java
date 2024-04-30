 class StringComparison {
    public static boolean compareIgnoreCase(String str1, String str2) {
        // Check if both strings are null
        if (str1 == null && str2 == null) {
            return true;
        }
        // Check if either string is null
        if (str1 == null || str2 == null) {
            return false;
        }
        // Compare the strings ignoring case
        return str1.equalsIgnoreCase(str2);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Check if the strings are equal ignoring case
        if (compareIgnoreCase(str1, str2)) {
            System.out.println("Strings are equal ignoring case.");
        } else {
            System.out.println("Strings are not equal ignoring case.");
        }
    }
}
