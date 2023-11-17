import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Sample12
{
	//HashSet<Integer>list1=new HashSet<>();
	TreeSet<Integer>list1=new TreeSet<>();
	void process()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		list1.add(1004);//Duplicate is not taken
		System.out.println("Your data is::"+list1);
		System.out.println("Size of the data::"+list1.size());
		System.out.println("Remove the data in::"+list1.remove(1001));
		System.out.println("After Removing Size of the data::"+list1.size());
		System.out.println("Searching the data is::"+list1.contains(1001));
		Iterator h1=list1.iterator();
		while(h1.hasNext())
		{
			System.out.println("Inside the loop is::"+h1.next());
		}
	}
	
}
public class CollectionP1 {

	public static void main(String[] args) {
		
		Sample12 d1=new Sample12();
		d1.process();

	}

}
