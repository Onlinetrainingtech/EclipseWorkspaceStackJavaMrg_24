import java.util.Scanner;

public class ExceptionP4 {

	void get1()
	{
		try
		{
			try
			{
//				int a=10/0;
//				System.out.println("Your value is::"+a);
				int empid;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value is::");
				empid=sc.nextInt();
				System.out.println("Your value is::"+empid);
			}
			catch(ArithmeticException t1)
			{
				System.out.println("Please division"+t1);
			}
			try
			{
				String name="Welcome";
				System.out.println("Length of the name is::"+name.length());
			}
			catch(NullPointerException t2)
			{
				System.out.println("Please check the value"+t2);
			}
		}
		catch(Exception t)
		{
			System.out.println("ExceptionBlock"+t);
		}
		finally
		{
			System.out.println("This is finally block");
		}
	}
	public static void main(String[] args) {
		
		ExceptionP4 f1=new ExceptionP4();
		f1.get1();

	}

}
