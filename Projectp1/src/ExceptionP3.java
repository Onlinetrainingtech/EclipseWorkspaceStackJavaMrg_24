import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionP3 {

	void get1()
	{
		try
		{
		String s1=null;
		System.out.println("Total length of the String::"+s1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Check the variable");
		}
	}
	void get2()
	{
		try
		{
		int empid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value is::");
		empid=sc.nextInt();
		System.out.println("Your value is::"+empid);
		}
		catch(InputMismatchException t)
		{
			System.out.println("Please the check input");
		}
	}
	public static void main(String[] args) {
		
		ExceptionP3 f1=new ExceptionP3();
		//f1.get1();
		f1.get2();

	}

}
