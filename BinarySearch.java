public class BinarySearch {

    // Binary search function
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            
            // If the target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Target not found in the array
        return -1;
    }

    // Main method to test binary search
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
        int target = 23;
        int result = binarySearch(sortedArray, target);
        
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
