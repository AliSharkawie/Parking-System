package AssignmentPackage;

public class parkout extends park{

	Parkin pin = new Parkin() ;
	public long out_time ;
	long timein = pin.arrive_time ;
	public long total_time ;
	
	public void calculate_outT()
	{
		out_time = System.currentTimeMillis() ;
	}
	public void calc_total_time()
	{
		total_time = out_time - timein ;
	}
	public double  calc_fees()
	{
		return (total_time)*5 ;
	}
	public long getOut_time() {
		return out_time;
	}
	public void setOut_time(long out_time) {
		this.out_time = out_time;
	}
	public long getTotal_time() {
		return total_time;
	}
	public void setTotal_time(long total_time) {
		this.total_time = total_time;
	}
	
}
