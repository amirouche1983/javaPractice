package OOPConceptPart1;

public class FunctionsInJava {
         
	     //main method--> is a starting point of execution
	
	public static void main(String[] args) {
		FunctionsInJava OBJ = new FunctionsInJava();
		//one object will be created, OBJ is the reference variable,referring to this object
		//after creating the object, the copy of all non static methods will be given to this object
 
		OBJ.test();
		int l=OBJ.pqr();
		System.out.println(l);
		String s1=OBJ.qa();
		System.out.println(s1);
		int d1=OBJ.division(30, 10);
		System.out.println(d1);
		
		//main method is written with the word void --> because it never return a value
	}
	
	//non static methods
	
	//void ---does not return any value
	// return type= void
	public void test() {// no input, no output
		
		System.out.println("test method");
		
	}
	
	//return type = int
	public int pqr(){//no input, some out put
		
		System.out.println("pqr method");
		int a =10;
		int b =20;
		int c =a+b;
		return c;
		
	}
	
	//return type--> String
	public String qa() {//no input, some output
		System.out.println("qa method");
		String s="selenium";
		return s;
	}
	//return type--> int
	//s,y --> input parameters/arguments
	
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		return d;
		
	}

}
