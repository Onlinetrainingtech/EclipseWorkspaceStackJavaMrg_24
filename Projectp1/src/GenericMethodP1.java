class Demo21
{
	public <M> M test(M t)//public int test(int t)
	{
		return t;
	}
}
public class GenericMethodP1 {

	public static void main(String[] args) {
		
		Demo21 g1=new Demo21();
		System.out.println(g1.test(1001));
		System.out.println(g1.test("azar"));
        System.out.println(g1.test(100.5));
	}

}
