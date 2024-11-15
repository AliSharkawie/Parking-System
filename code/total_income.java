package AssignmentPackage;

public class total_income {

	parkout pout = new parkout() ;
	Parkin pin = new Parkin() ;
	garage g = new garage() ;
	double  icome  ;
	
	public double getIcome() {
		return icome;
	}

	public void setIcome(int icome) {
		this.icome = icome;
	}
	public double calc_income()
	{
		return getIcome()*g.getNum_slot() ; 
	}
	
}
