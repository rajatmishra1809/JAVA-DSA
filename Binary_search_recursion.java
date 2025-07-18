class Binary_search_recursion {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int key = 3;
        int low = 0;              
        int high = arr.length - 1; 
        Binary_search_recursion ob = new Binary_search_recursion();
        int result = ob.recursion(arr, key, low, high);
        
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public int recursion(int[] sortedArray, int key, int low, int high) {
        if (high < low) {
            return -1;
        }

        int middle = low + (high - low) / 2;

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return recursion(sortedArray, key, low, middle - 1);
        } else {
            return recursion(sortedArray, key, middle + 1, high);
        }
    }
}
