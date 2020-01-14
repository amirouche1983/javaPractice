package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBank.min_bal);
		
		HSBCBank hs =new HSBCBank();
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		
		//dynamic polimorphism
		//child class object can be referred by parent interface reference variable
		
		USBank b = new HSBCBank();
		
		b.credit();
		b.debit();
		b.transferMoney();
		
		
		
		BrazilBank b1 = new HSBCBank();
		
		
		b1.mutualFund();
		
		
		
		
		
		
		
	}

}
