class B
{
	int productid=1001;
	String pname="apple";
	void get1()
	{
		System.out.println("Your Base class value is::"+productid);
		
	}

}
class D extends B
{
	void get2()
	{
	   System.out.println("Your Derived class value is::"+pname);
	   get1();
	}
}
public class SingleInheritanceP1 {

	public static void main(String[] args) {
		
		D f1=new D();
		//f1.get1();
		f1.get2();

	}

}
