
public class Sample {

	String pname="apple";//Global variable or class or instance
	void get1()
	{
		int pid=1003;//local variable
		System.out.println("This is get1 method"+pid);
	}
	void get2()
	{
		System.out.println("This is get2 method"+pname);
	}
	void get3(int cid,String cname)//Passing the Arugment
	{
		System.out.println("This is get3 method"+cid+""+cname);
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.get2();
		s1.get3(2001,"azar");
		

	}

}
