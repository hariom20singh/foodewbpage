import java.util.Scanner;

public class Marks extends Student {
    private int m1,m2,total;

    public void read() {
        Scanner scan=new Scanner(System.in);
        super.read();
        System.out.println("Enter Marks 1 : ");
        m1=scan.nextInt();
        System.out.println("Enter Marks 2 : ");
        m2=scan.nextInt();
        total=m1+m2;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("M1: "+m1+"\nM2: "+m2+"\nTotal: "+total);
    }
}
