package AssignmentPackage;

import java.util.ArrayList;

public class display {
	parkout pout = new parkout () ;
	ArrayList<slot> slots = new ArrayList<slot>() ;
	public void displaySlot(){
		for (int i=0 ;i<slots.size();i++)
		{
			if(slots.get(i).free_s == true )
			System.out.print(slots.get(i));
		}
	}
	public void displayIncome(){
		System.out.print(pout.getAmount());
	}
	
	
}
