import java.util.Scanner;

// Custom exception class
class InvalidStringException extends Exception {
    public InvalidStringException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        try {
            // Check if the string length is less than five
            if (inputString.length() < 5) {
                throw new InvalidStringException("Invalid String");
            }

            // Convert the string to uppercase and display it
            String upperCaseString = inputString.toUpperCase();
            System.out.println("Uppercase String: " + upperCaseString);
        } catch (InvalidStringException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
