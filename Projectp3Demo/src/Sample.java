
public class Sample {
	
	int pid;
	String pname;
	void get1(int pid,String pname)
	{
		this.pid=pid;
		this.pname=pname;
		System.out.println("This is get1 function"+pid+""+pname);
	}
	void get2()
	{
		System.out.println("This is get2 function"+pid+""+pname);
	}

	public static void main(String[] ar) {
		
		System.out.println("welcome to the Application");
		Sample obj1=new Sample();
		obj1.get1(1001,"apple");
		obj1.get2();

	}

}
