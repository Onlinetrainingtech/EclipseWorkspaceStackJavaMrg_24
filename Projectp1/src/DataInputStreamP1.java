import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamP1 
{
	int productid,productprice,categoryid;
	String productname,categoryname;
	DataInputStream dis=new DataInputStream(System.in);
    void addProduct() throws NumberFormatException, IOException
    {
    	System.out.println("Enter the ProductDetails::");
    	productid=Integer.parseInt(dis.readLine());
    	productprice=Integer.parseInt(dis.readLine());
    	productname=dis.readLine();//String type
    }
    void addCategory() throws IOException
    {
    	System.out.println("Enter the CategoryDetails::");
    	categoryid=Integer.parseInt(dis.readLine());
    	categoryname=dis.readLine();
    }
    void display()
    {
    	System.out.println("Your ProductDetails is::");
    	System.out.println(productid+""+productname+""+productprice);
    	System.out.println("Your CategoryDetails is::");
    	System.out.println(categoryid+""+categoryname);
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		DataInputStreamP1 d1=new DataInputStreamP1();
		d1.addProduct();
		d1.addCategory();
		d1.display();

	}

}
