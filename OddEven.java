public class OddEven {
    public static void main(String args[]) {

        //odd even with ueser input

         Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
        // int n = 10;
        // int bitMask = 1;
        // if((n & bitMask) == 0) {
        //     System.out.println("even");
        // } else {
        //     System.out.println("odd");
        // }
    }
}
