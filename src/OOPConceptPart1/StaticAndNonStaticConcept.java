package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	//global variable : the scope of global variable will be available  across all the functions with some conditions.
	
	String name ="Tom";// non static global variable
	static int age=25; //static global variable
	
	
	
	public static void main(String[] args) {
		
		//how to call static method and variable
		//1. direct calling :
		sum();
		//2. calling by class name:
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		// how to call non static method and variables
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// can i access static method by using object reference ? yes
		obj.sum();//warning will be given
		
	}

	
	public void sendMail(){//non static method
		System.out.println("send mail method");
	}
   public static void sum(){//static method
	   System.out.println("sum method");
		
	}
}
