
public class MainDemo {

	void get1() throws ExceptionDemo
	{
		int a=10%3;
		if(a==0)
		{
		throw new ExceptionDemo();//declared the custom exception
		}
		else
		{
		System.out.println("Your value is::"+a);
		}
	}
	public static void main(String[] args) throws ExceptionDemo {
		
		MainDemo f1=new MainDemo();
		f1.get1();
	}

}
