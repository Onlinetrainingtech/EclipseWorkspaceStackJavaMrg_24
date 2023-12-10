import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

public class FileIO {

	String data;
	Scanner sc=new Scanner(System.in);
	void get1() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\m1.txt");
			System.out.println("Enter the data..");
			data=sc.next();
			byte s[]=data.getBytes();
			fos.write(s);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void readData() throws IOException
	{
		int i;
		try
		{
			FileInputStream fis=new FileInputStream("D:\\m1.txt");
			while((i=fis.read())!=-1)
			{
				
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void copyData() throws IOException
	{
		int i;
		try
		{
			FileInputStream fis=new FileInputStream("D:\\m1.txt");
			FileOutputStream fos=new FileOutputStream("D:\\m2.txt");
			while((i=fis.read())!=-1)
			{
				
				fos.write((byte)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
		
	}
	void readSeq() throws IOException
	{
		try
		{
			int i;
			FileInputStream f1=new FileInputStream("D:\\m1.txt");
			FileInputStream f2=new FileInputStream("D:\\m2.txt");
			FileOutputStream fos=new FileOutputStream("D:\\m3.txt");
			SequenceInputStream sis=new SequenceInputStream(f1,f2);
			while((i=sis.read())!=-1)
			{
				//System.out.print((char)i);
				fos.write((byte)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	public static void main(String[] args) throws IOException {
		
		FileIO f1=new FileIO();
		//f1.get1();
		//f1.readData();
		//f1.copyData();
		f1.readSeq();

	}

}
