package OOPConceptPart1;

public class LocalVariableVsGlobalV {

	String name ="Tom"; //global variable--class variable
	int age =25;
	
	public static void main(String[] args) {
	
    
		int i =10;//local variable for main method
		
		System.out.println(i);
		
		LocalVariableVsGlobalV obj=new LocalVariableVsGlobalV();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	
	public void sum() {
		int i =10;//local variable for sum method
		int j=20;
		
	}
	
	
	
	
	
}
