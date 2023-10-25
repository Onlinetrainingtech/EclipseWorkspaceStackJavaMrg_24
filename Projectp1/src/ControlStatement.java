import java.util.Scanner;

class Demo3
{
	void get1()
	{
		int productid=2001;
		if(productid==1001)
		{
			System.out.println("ProductId is equal");
		}
		else
		{
			System.out.println("ProductId is not equal");
		}
	}
	void get2()
	{
		int age,salary,bns;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("Enter the salary is::");
			salary=sc.nextInt();
			if(salary>=20000)
			{
				bns=salary+500;
				System.out.println("Your Salary is::"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
	}
	void get3()
	{
		int exp=1;
	     switch(exp)
	     {
	     case 1:
	    	 System.out.println("Case 1");
	    	 break;
	     case 2:
	    	 System.out.println("Case 2");
	    	 break;
	     case 3:
	    	 System.out.println("Case 3");
	    	 break;
	     default:
	    	 System.out.println("Default case");
	     }
	}
}
public class ControlStatement {

	public static void main(String[] args) {
		
		Demo3 f1=new Demo3();
		//f1.get1();
		//f1.get2();
		f1.get3();

	}

}
