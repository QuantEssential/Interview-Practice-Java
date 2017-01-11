
public class ThreadTest extends Thread implements Runnable {

	ThreadTest()	{
	
		Thread t = new Thread(this);
		t.start();
		
		Thread th = new Thread(this);
		th.start();
				
	}
	
	public void hello()		{
		System.out.println("Hello");
	}
	
	public static void main(String args[])	{
		new ThreadTest();
	}
	
	public void run()	{
		System.out.println("Thread Started");
	}
	
	
}
