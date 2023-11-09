class B12
{
	int employeeid=2001;
	int salaryDetails;
	String employeeAddress;
	void get1()
	{
		System.out.println("This is Baseclass value is::"+employeeid);
	}
}
class D12 extends B12
{
	void get2()
	{
		int employeeid=3001;
		System.out.println("This is Derived class is::"+super.employeeid);
	}
	//This Keyword
	void get3(int salaryDetails,String employeeAddress)
	{
		this.salaryDetails=salaryDetails;
		this.employeeAddress=employeeAddress;
		System.out.println("Concepts this Keyword::"+salaryDetails+","+employeeAddress);
	}
	void display()
	{
		System.out.println("Concepts this Keyword::"+salaryDetails+","+employeeAddress);
	}
}

public class SuperExample {

	public static void main(String[] args) {
		
		D12 f1=new D12();
		f1.get1();
		f1.get2();
		f1.get3(1000,"uk");
		f1.display();

	}

}
