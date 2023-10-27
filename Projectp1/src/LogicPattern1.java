import java.util.Scanner;

public class LogicPattern1 {

	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				//System.out.print("*");
				System.out.println("I value is::"+i+"J value is::"+j);
			}
			System.out.println();
		}

	}

}
