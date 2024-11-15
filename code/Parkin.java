package AssignmentPackage;
import java.util.ArrayList;

public class Parkin extends park {

	bestFit bf = new bestFit() ;
	garage g1 = new garage() ;
	ArrayList<slot> slots = new ArrayList<slot>() ;
	public long arrive_time ;
	public void calculate_arriveT()
	{
		arrive_time = System.currentTimeMillis() ;
	}
	
	
	public boolean check_slot() {
		if(g1.getNum_slot()>0){
			return true  ;
		}
		return false ;
	}
@SuppressWarnings("static-access")
	public void add_slot (int w , int l ){
		for (int i=0 ;i<slots.size();i++)
		{
			if (slots.get(i).width == w && slots.get(i).depth==l && slots.get(i).free_s )
					{
						g1.num_slot --;
						slots.get(i).free_s =false ;
					}
		}
		
		
	}
	
	
	
	public void display_slots (){
		System.out.print(slots);
	}

}
