package OOPConceptPart2;

import java.util.logging.Logger;

public interface USBank {
String amar ="bla";
	int min_bal =100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	public static void laon() {
		System.err.println("hello");
	}
	//only method declaration
	//no method body - only method prototype
	//in interface, we can declare the variable, variables are by default static in nature
	//variables value will not be changed ; its final / constant in nature
	
	//no static method in interface
	//no main method in interface 
	//we can not create object of interface 
	//interface is  abstract in nature
	
	public static void main(String[]args) {
		USBank.laon();
		System.err.println("only method declaration");
		Logger.getLogger(amar);
		
	}
	

	
	
}
