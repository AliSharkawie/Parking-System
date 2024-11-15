package AssignmentPackage;

import java.util.Scanner;

public class bestFit implements configuration {

	int config ;
	private Scanner input;
	public void set_config(int s) {
		input = new Scanner(System.in); 
		System.out.print("enter configurations \n");
		setConfig(input.nextInt()) ;
		
	}
	public int getConfig() {
		return config;
	}
	public void setConfig(int config) {
		this.config = config;
	}
	
	

}
