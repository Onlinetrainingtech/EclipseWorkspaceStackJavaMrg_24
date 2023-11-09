class Demo13
{
	Demo13()
	{
		System.out.println("This is default cons..");
	}
	Demo13(int empid,String empname)
	{
		System.out.println("This is Param Consts..."+empid+""+empname);
	}
}
public class ConstructorP1 {

	public static void main(String[] args) {
		
		new Demo13();
		new Demo13(1001,"azar");

	}

}
