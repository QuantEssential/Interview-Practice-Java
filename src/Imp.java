
final class Imp extends Abstraction implements Inter, Inter2 {

	i c;
	
	protected final static int zero=0; //constant
	
	public void undef() {
		System.out.println("Defined");
	}
	
	public void undef2() {
		System.out.println("Defined");
	}
	
	public void inter2() {
		System.out.println("Defined 2");
	}
	public class i extends interclass {
		String s;
		i() {s="s"; f = "f";}
	}
	
	Imp() {
		c = new i();
		System.out.println(c.s+zero);
		System.out.println(c.f);
		finalnot();
	}
	
	public void finalnot()	{
		c.f="";
	}

	public static void main(String args[]) {
		System.out.println(Imp.dan());
		Integer int1 = 1;
		int $int2 = (int)int1;
		System.out.println($int2*=256);
		byte b = (byte)$int2;
		System.out.println(b);
		Imp I = new Imp();
		I.undef();
		I.inter2();
	}
}
