interface B1
{
	int empid=1001;//Only Assing the value 
	void get1();//Only declare the method
}
class D3 implements B1
{
	public void get1()
	{
		System.out.println("Your empid is::"+empid);
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		D3 f1=new D3();
		f1.get1();

	}

}
