public class BinarySearch {

    int binarySearch(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {

        BinarySearch search = new BinarySearch();

        int arr[] = {2, 3, 4, 10, 40};
        int target = 10;

        int result = search.binarySearch(arr, target);

        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
