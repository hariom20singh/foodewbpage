import java.util.*;
class GCD {
    public static int g(int a, int b)
    {
        if (b==0)
            return a;
        else
        {
            int t=a%b;
            a=b;
            b=t;
            return g(a,b);
        }
        
    }
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value a : ");
		int a = sc.nextInt();
        System.out.print("Enter the Value b : ");
		int b = sc.nextInt();
        int y = g(a,b);
        System.out.println("GCD OF "+a+" AND "+b+" = "+y);
    }
}
