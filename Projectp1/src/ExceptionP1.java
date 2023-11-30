
public class ExceptionP1 {

	void get1()
	{
		try
		{
		int a=10/2;
		System.out.println("Your value is::"+a);
		}
		catch(Exception t)
		{
			System.out.println("Please check you value"+t);
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2");
	}
	public static void main(String[] args) {
		
		ExceptionP1 f1=new ExceptionP1();
		f1.get1();

	}

}
