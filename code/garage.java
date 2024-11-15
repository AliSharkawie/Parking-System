package AssignmentPackage;

// ArrayList<slot> slots = new Arraylist<slot>(); 


public class garage {
	static int num_slot = 0;
	public String config ;
//	Scanner input = new Scanner(System.in) ; 
	public void calc_total_income()
	{
		
	}
	public static boolean  check_slot(){
		return false ;
	}

	public int getNum_slot() {
		return num_slot;
	}
	public static void setNum_slot(int num_slot1) {
		
		num_slot = num_slot1;
	}
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}

	
/*	
//	static Scanner input = new Scanner(System.in) ;
	ArrayList<slot> slots = new ArrayList<slot>() ;
	public void owner(String cinfiguration , int num)
	{
		setConfig(cinfiguration) ;
		setNum_slot(num);
		
		Scanner input = new Scanner(System.in) ;
		for(int i=0 ;i< getNum_slot() ; i++)
		{
			System.out.print("enter domension for "+ i + " slot \n ");
			slots.Width.add(input.nextDouble());
			slots.depth.add(input.nextDouble());
			slots.free_s.add(input.nextInt());
		}
	}
*/
}