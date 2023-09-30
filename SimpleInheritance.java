abstract class Person
{
    String Bday;
    String fname;
    String lname;
    Person(String Bday, String fname, String lname)
    {
        this.Bday = Bday;
        this.fname = fname;
        this.lname = lname;
    }
    void Display()
    {
        System.out.println("Bday: "+Bday);
        System.out.println("First name: "+fname);
        System.out.println("last name: "+lname);
    }
}
class Contact extends Person
{
    String email;
    int phno;
    Contact(String Bday, String fname, String lname, String email, int phno)
    {
        super(Bday, fname, lname);
        this.email = email;
        this.phno = phno;
    }
    void Display()
    {
        super.Display();
        System.out.println("Email: "+email);
        System.out.println("Phone No: "+phno);
    }
}
abstract class Employee extends Person
{
    String post;
    int id;
    Employee(String Bday, String fname, String lname, String post, int id)
    {
        super(Bday, fname, lname);
        this.post = post;
        this.id = id;
    }
    void Display()
    {
        super.Display();
        System.out.println("ID: "+id);
        System.out.println("Post: "+post);
    }
}
class SalesMan extends Employee
{
    SalesMan(String Bday, String fname, String lname, String post, int id)
    {
        super(Bday, fname, lname, post, id);
        this.post = post;
        this.id = id;
    }
    void Display()
    {
        super.Display();
    }
}
class SimpleInheritance 
{
    public static void main(String[] args)
    {
        Contact cnt = new Contact("01/01/2001","sva","fCC","dv@gmail.com",985541);
        cnt.Display();

        SalesMan sal = new SalesMan("01/01/2001","sva","fCC","Manager",122);
        sal.Display();
    }
}