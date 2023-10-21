import java.util.Random;

public class FisherYatesShuffle {
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        shuffleArray(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }
}
