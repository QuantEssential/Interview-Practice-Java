
public class SeaMain {

	public static SeaCreature creat(SeaCreature sc)	{
		
		sc.roar();
		
		if(sc instanceof Dolphin)	{
			Dolphin d = (Dolphin)sc;
			System.out.println(d.dolph());
		}
		
		return sc;
	}
	
	
	
	static public void main(String a[])	{
		
		SeaCreature sc = new Dolphin();
		
		creat(sc);
		
	}
}
