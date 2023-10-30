import java.util.Scanner;

public class ArrayLogic {

	int a[]=new int[3];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=2;i++)
		{
			System.out.println("Enter the array value is::");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value is::");
		int k=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				System.out.println("Its found");
				break;
				
			}
			else
			{
				System.out.println("It is not found");
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		ArrayLogic f1=new ArrayLogic();
		f1.get1();
		

	}

}
