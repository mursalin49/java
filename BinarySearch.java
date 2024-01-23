public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetValue = 6;

        int result = binarySearch(sortedArray, targetValue);

        if (result == -1) {
            System.out.println("Element not present in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    // Binary Search method
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Element found
            } else if (arr[mid] < target) {
                low = mid + 1; // Discard the left half
            } else {
                high = mid - 1; // Discard the right half
            }
        }

        return -1; // Element not found
    }
}
