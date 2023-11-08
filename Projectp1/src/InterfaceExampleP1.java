interface ib1
{
	int empid=2001;
	void get1();
}
interface ib2
{
	String empname="azar";
	void get2();
}
class id1 implements ib1,ib2
{

	@Override
	public void get2() {
		
		System.out.println("Your empname is::"+empname);
		
	}

	@Override
	public void get1() {
		System.out.println("Your empid is::"+empid);
		
	}
	
}
public class InterfaceExampleP1 {

	public static void main(String[] args) {
		
		id1 f1=new id1();
		f1.get1();
		f1.get2();

	}

}
