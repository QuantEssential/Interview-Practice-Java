
public class Child extends Parent implements Runnable {

	public Child()  {
		super();
		System.out.println("Child");
		starter();
	}
	
	public void starter() {
		override();
		parentover();
		Thread t = new Thread(this);
		t.start();
	}
	
	static{
		System.out.println("Hello");
	}
	
	public void override() {
		System.out.println("Child override");
	}
	
	public void parentover() {
		super.override();
	}
	
	public static void main(String args[]) {
		Parent p = new Child();	
		p.override();
		p = new Parent();
		p.override();
	}

	@Override
	public void run() {

		System.out.println("Thread Started");
		
	}
}
