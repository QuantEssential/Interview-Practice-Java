
public class cars {

	public static int calc(int[] a)	{
		int passnum=0;
		int traveast = 0;
		for(int i =0; i<a.length; i++)	{
			if(a[i] == 0)	{
				traveast++;
			}
			else if(a[i] == 1){
				passnum += traveast;
			}
			if(passnum >= 100000)	{
				return 100000;
			}
		}
		
		/*int travwest = 0;
		for(int j=a.length-1; j>=0; j--){
			if(a[j] == 1)	{
				travwest ++;
			} else if(a[j] == 0){
				passnum += travwest;
			}
			if(passnum >= 100000)	{
				return 100000;
			}
				
		}*/
		return passnum;
	}
	
	public static void main(String a[])	{
		int[] arr = new int[] {0,1,0,1,1};
		System.out.println(Integer.toString(calc(arr)));
	}
}
