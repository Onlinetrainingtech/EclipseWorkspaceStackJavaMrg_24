class Demo15 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("ThreadIn");
			Thread.sleep(10000);
			System.out.println("ThreadOut"+currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			
		}
//		System.out.println("This is Thread Running..");
	}
}
public class ThreadP1 {

	public static void main(String[] args) {
		
		Demo15 t1=new Demo15();//Thread-0
		Demo15 t2=new Demo15();//Thread-1
		System.out.println(t1.isAlive());
		t1.start();
		t1.setName("ThreadWelcome");
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getName());
		
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t2.getName());
		
		System.out.println(t1.isInterrupted());
		try
		{
			t1.join(10000);
		}
		catch(InterruptedException t)
		{
			
		}
		t2.start();

	}

}
