public class MPH
{
	static int d, h, m, mph;
	
	public void MilesPerHour()
	{
		d = 0;
		h = 0;
		m = 0;
		mph = 0;
	}
	
	public void MilesPerHour(int dist, int hour, int minute)
	{
		d = dist;
		h = hour;
		m = minute;
		mph = 0;
	}
	
	public void setParams(int dist, int hour, int minute)
	{
		d = dist;
		h = hour;
		m = minute;
	}
	
	public int getMPH()
	{
		mph = d / (h + m / 60);
		return mph;
	}
}