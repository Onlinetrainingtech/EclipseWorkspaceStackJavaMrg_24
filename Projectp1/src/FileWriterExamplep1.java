import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExamplep1 {

	public static void main(String[] args) throws IOException
	{
		
        FileWriter fw=new FileWriter("D:\\m4.txt");
        fw.write("Welcome to the ourclass");
        fw.close();
	}

}
