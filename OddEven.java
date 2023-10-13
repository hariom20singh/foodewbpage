import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {
        //user input
         Scanner myObj = new Scanner(System.in);
         int n = myObj.nextInt();
       // int n = 10;
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
