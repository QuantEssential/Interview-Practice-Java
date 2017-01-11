
public interface WatchInterface {

	public void setmode(String S);
	public void resetminute();
	public void resetsecond();
	public void increment();
	public boolean setall(int s, int m, int h);
	public boolean setsec(int s);
	public boolean setmin(int m);
	public boolean sethour(int h);
	public void run();
}
