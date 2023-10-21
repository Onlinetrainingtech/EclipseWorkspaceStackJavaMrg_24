import java.util.Scanner;

public class Sample1 {

	int cid;
	String cname;
	Scanner s1=new Scanner(System.in);
	void input1()
	{
		
		System.out.println("Enter the cid is::");
		cid=s1.nextInt();
		//System.out.println("My cid is::"+cid);
	}
	void input2()
	{
		System.out.println("Enter the cname is::");
		cname=s1.next();
		//System.out.println("Your name is::"+cname);
	}
	void display()
	{
		System.out.println("Your cid::"+cid+"Your cname::"+cname);
	}
	
	public static void main(String[] args) {
		
	Sample1 f1=new Sample1();
	f1.input1();
	f1.input2();
	f1.display();

	}

}
