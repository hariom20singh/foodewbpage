import java.util.*;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void selectionSortDescending(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            int maxPos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }

            int temp = arr[turn];
            arr[turn] = arr[maxPos];
            arr[maxPos] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        
        // Perform ascending selection sort
        selectionSort(arr);
        System.out.print("Ascending Order: ");
        printArr(arr);

        // Perform descending selection sort
        selectionSortDescending(arr);
        System.out.print("Descending Order: ");
        printArr(arr);
    }
}

