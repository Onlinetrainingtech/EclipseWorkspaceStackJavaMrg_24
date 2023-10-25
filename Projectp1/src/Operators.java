class Demo
{
	void arithmeticOperators()
	{
		int a1=20,b1=10;
		System.out.println("Addition::"+(a1+b1));
		System.out.println("Sub::"+(a1-b1));
		System.out.println("Mult::"+(a1*b1));
		System.out.println("Division::"+(a1/b1));
		System.out.println("Module::"+(a1%b1));
	}
	void comparisionOperator()
	{
		int a2=100,b2=50;
		System.out.println("Lessthan::"+(a2<b2));
		System.out.println("Greaterthan::"+(a2>b2));
		System.out.println("Equal to::"+(a2==b2));
		System.out.println("NotEqual to::"+(a2!=b2));
	}
	void logicalOperator()
	{
		int a1=100,b1=200;
		System.out.println("LogicalAND::"+((a1<b1)&&(b1>a1)));
		System.out.println("LogicalOR::"+((a1>b1)||(b1>a1)));
		System.out.println("LogicalNOT::"+!(a1>b1));
	}
	void bitwiseOperator()
	{
		int a=2,b=3;
		System.out.println("BitWiseAND::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("BitWiseXOR::"+(a^b));
		System.out.println("LeftShift::"+(a<<1));
		System.out.println("RightShift::"+(a>>1));
	}
}
public class Operators {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.arithmeticOperators();
		f1.comparisionOperator();
		f1.logicalOperator();
		f1.bitwiseOperator();

	}

}
