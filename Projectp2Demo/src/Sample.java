class Product
{
	void addProduct()
	{
		System.out.println("This is addProduct");
	}
	void addCategory()
	{
		System.out.println("This is addCategory");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Application");
		Product s1=new Product();
		s1.addProduct();
		s1.addCategory();

	}

}
