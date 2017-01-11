
public class variables {

	Integer Jondie;
	Double d;
	String str;
	
	variables() {
		Jondie = 7;
		d = 7.7777;
		str = "JJJJ";
		str = str + Jondie.toString();
		System.out.println(str);
	}
	
	public static void main(String s[])	{
		new variables();
	}
	
}
