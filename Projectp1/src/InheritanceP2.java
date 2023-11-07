import java.util.Scanner;

class BaseClass
{
	int empid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid is::");
		empid=sc.nextInt();
	}
}
class D1 extends BaseClass
{
	
	String empname;
	void get2()
	{
		System.out.println("Enter the empname is::");
		empname=sc.next();
		
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
}
public class InheritanceP2 {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
