
public class Watch implements WatchInterface {

	int hour;
	int minute;
	int second;
	String mode;
	String ampm;
	
	Watch()	{
		hour=1;
		minute=0;
		second=0;
		mode = "Normal";
		ampm="AM";
	}
	
	public void setmode(String S)	{
		if(S.equals("Army"))	{
			//set to army time
		}
		if(S.equals("Normal"))	{
			//set to normal
		}
		
	}
	
	public void resetminute()	{
		minute = 0;
		if(hour<12)	{
			hour++;
		} else	{
			if(ampm.equals("PM"))	{
				ampm = "AM";
			} else if(ampm.equals("AM"))	{
				ampm = "PM";
			}
			hour = 1;
		}
	}
	
	public void resetsecond()	{
		second = 0;
		if(minute<59){
			minute++;
		} else	{
			resetminute();
		}
	}
			
		
	public void increment()	{
		if(second<59){
			second++;
		} else	{
			resetsecond();
		}
	}
	
	public boolean setall(int s, int m, int h){
		if(s>59){
			return false;
		}	else	{
			second = s;
		}
		if(m>59){
			return false;
		}  else	{
			minute = m;
		}
		if(h>12)	{
			return false;
		}	else	{
			hour = h;
		}
		
		return true;
	}
	
	public boolean setsec(int s)	{
		if(s>59){
			return false;
		}	else	{
			second = s;
		}
		return true;
	}
	public boolean setmin(int m)	{
		if(m>59){
			return false;
		}	else	{
			minute = m;
		}
		return true;
	}
	public boolean sethour(int h)	{
		if(h>12)	{
			return false;
		}	else	{
			hour = h;
		}
		
		return true;
	}
	
	public void run() {
		while(true){
			System.out.println(hour + ":" + minute + ":" + second + ampm);
			increment();
		}
	}


public static void main(String args[])	{

	Watch w = new Watch();
	w.run();
}
}