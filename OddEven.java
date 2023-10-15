public class OddEven {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scan.nextInt();
        if(num%2== 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
