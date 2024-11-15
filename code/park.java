package AssignmentPackage;

import java.util.Scanner;

public abstract class park {
	private double amount;
	private Scanner input;
	
	public void pay (){
		input = new Scanner(System.in); 
		System.out.print("pay please ....  \n");
		setAmount(input.nextDouble()) ;
		
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
}
