class Demo20<M>
{
	public M t;
	public void setValue(M t)
	{
		this.t=t;
	}
	public void get1()
	{
		System.out.println("This is get value is::"+t);
	}
}
public class GenericClass {

	public static void main(String[] args) {
		
		Demo20<Integer>d1=new Demo20<Integer>();
		d1.setValue(1001);
		Demo20<String>d2=new Demo20<String>();
		d2.setValue("admin");

	}

}
