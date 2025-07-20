public class InterpolationSearch {

    // Function to perform interpolation search
    public static int interpolationSearch(int[] arr, int low, int high, int key) {
        while (low <= high && key >= arr[low] && key <= arr[high]) {
            // Avoid division by zero
            if (low == high) {
                if (arr[low] == key)
                    return low;
                return -1;
            }

            // Estimate the position
            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            // Found the key
            if (arr[pos] == key)
                return pos;

            // If key is larger, key is in upper part
            if (arr[pos] < key)
                low = pos + 1;

            // If key is smaller, key is in lower part
            else
                high = pos - 1;
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 70;

        int index = interpolationSearch(arr, 0, arr.length - 1, key);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found in array.");
    }
}
