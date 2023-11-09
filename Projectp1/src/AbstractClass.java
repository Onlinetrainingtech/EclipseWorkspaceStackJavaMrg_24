abstract class Demo11
{
	abstract void get1();//This is abstract method
	void get2()
	{
		System.out.println("This is Normal Method..");
	}
}

class F1 extends Demo11
{

	@Override
	void get1() {
		
		System.out.println("This is an abstraction");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		
		F1 s1=new F1();
		s1.get1();
		s1.get2();

	}

}
