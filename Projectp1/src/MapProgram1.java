import java.util.Map;
import java.util.TreeMap;

public class MapProgram1
{
	TreeMap<Integer,String>g1=new TreeMap<>();
	
	void get1()
	{
	    g1.put(1001,"azar");
	    g1.put(1002, "mohan");
	    g1.put(1003, "raja");
	    g1.put(1004, "sheik");
	    
	    for(Map.Entry m:g1.entrySet())
	    {
	    	System.out.println("Your key is::"+m.getKey()+"Your value is::"+m.getValue());;
	    }
	   System.out.println("Your size of the data::"+g1.size());
	   System.out.println("Remove the data is::"+g1.remove(1001));
	   System.out.println("Searching the data is::"+g1.containsKey(1001));
	   System.out.println("After Removing the data is::"+g1.size());
	}

	public static void main(String[] args) {
		
		MapProgram1 f1=new MapProgram1();
		f1.get1();

	}

}
