import java.io.*;
import java.util.*;

class MyException extends Exception
{

	MyException(String s)
	{
		super(s);
	}		


}


class TryDemo
{

	public static void main(String args[])
	{
		int a,b,flag=0;
		while(true)
{
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Enter First Number:");
			a = sc.nextInt();
			
		System.out.println("\n Enter Second Number:");
			b = sc.nextInt();
		
			
	

		try
		{
			if(b==0||a==0)
			{
				throw new MyException("Division By Zero is Not Possible");
				
				  
			}
			else
			{	int c=a/b;
			 	System.out.println("The Division is:"+c);	
			}
		}

		catch(MyException ex)
		{
			System.out.println("Exception Caught!!!!"+ex);

		}		


	}


}
}