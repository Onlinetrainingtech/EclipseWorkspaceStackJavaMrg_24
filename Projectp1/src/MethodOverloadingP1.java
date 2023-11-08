class Demo12
{
	void get1(int empid,String empname)
	{
		System.out.println("Your employedetails is::"+empid+","+empname);
	}
	void get1(String adminid,String adminpwd)
	{
		if(adminid.equals("admin")&&adminpwd.equals("admin@123"))
		{
			System.out.println("LoginSuccess!!!");
		}
		else
		{
			System.out.println("LoginFail!!!");
		}
	}
}
public class MethodOverloadingP1 {

	public static void main(String[] args) {
		
		Demo12 f1=new Demo12();
		f1.get1(1001,"azar");
		f1.get1("admin", "admin@123");

	}

}
