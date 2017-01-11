
public class ImpTest implements test {

	public void run()	{
		System.out.println("Run");
	}
	
	public void newmethod()	{
		System.out.println("NewMethod");
	}
	ImpTest()	{
		
		test newtest = new ImpTest();
		newtest.run();
	}
	
	public static void main()	{
		new ImpTest();
	}
}
