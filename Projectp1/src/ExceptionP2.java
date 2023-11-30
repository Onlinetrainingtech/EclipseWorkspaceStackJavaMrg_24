import java.util.Scanner;

public class ExceptionP2 {

	int empid[]=new int[2];//Total size is 0,1
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		try
		{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the Array:::");
			empid[i]=sc.nextInt();
		}
		}
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("Please check the size");
		}
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Your Array Value is::"+empid[i]);
		}
	}
	public static void main(String[] args) {
		
		ExceptionP2 f1=new ExceptionP2();
		f1.get1();
		f1.get2();
	}

}
