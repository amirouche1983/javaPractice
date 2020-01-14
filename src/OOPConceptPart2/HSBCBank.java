package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank {//we are achieving multiple inheritance
     //is-a relationship 
	
	
	//if a class implementing any interface, then its mandatory
	//overriding from USBank
	public void credit() {
		System.out.println("hsbc---cerdit");
		
	}
	
	public void debit() {
		System.out.println("hsbc----debit");
	}
	
	public void  transferMoney() {
		System.out.println("hsbc----transferMoney");
	}
	
	//Separate methods of HSBCBank class 
	public void educationLoan() {
		System.out.println("hsbc---edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc---car loan");
	}
	
	//Brazil Bank method: overriding from BrazilBank
	
	public void mutualFund() {
		System.out.println("hsbc----mutual fund");
	}
	
	
	
}
