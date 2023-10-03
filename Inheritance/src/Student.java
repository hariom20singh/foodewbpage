import java.util.Scanner;

public class Student {
    private  int rollno;
    private  String name;
    public void read(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Roll. No. : ");
        rollno=scan.nextInt();
        System.out.println("Enter Name: ");
        name=scan.next();

    }
    public void display(){
        System.out.println("Roll No. : "+rollno+ "\nName : "+name);
    }
}
