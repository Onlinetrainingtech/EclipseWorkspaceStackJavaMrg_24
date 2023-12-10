import java.io.BufferedWriter;
import java.io.FileWriter;

public class BuffereWriterP1 {

	public static void main(String[] args) throws Exception
	{
		
		FileWriter fw=new FileWriter("D:\\m5.txt");
		BufferedWriter buffer=new BufferedWriter(fw);
		buffer.write("Welcome to the Application");
		buffer.close();
		System.out.println("Inserted Success...");

	}

}
