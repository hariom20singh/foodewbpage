public class MaxNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 15};

        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The maximum number in the array is: " + max);
    }
}
