package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism --compile-time polymorphism
		BMW b =new BMW();
		b.satrt();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		System.out.println("*******");
		
		Car c =new Car();
		
		c.strat();
		c.stop();
		c.refuel();
		
		System.out.println("*******");
		//Top casting
		Car c1 =new BMW(); //child class object can be referred by parent class reference 
		                   //variable --dynamic polymorphism-->Run-time polymorphism
		
		c1.strat();
		c1.stop();
		c1.refuel();
		
		//Down casting
		BMW b1=(BMW)new Car();//ClassCastException
	}

}
