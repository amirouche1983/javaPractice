package OOPConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj =new MethodOverLoading();
        
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}
	
	public static void main(int q, int h) {
		
	}
	//we can overload the main method also
	//you can not create a method inside a method
	//duplicate method -- i.e. same method name with same number of arguments are not allowed
	
	//method overloading --> when the method name is same with different arguments or input parameters within the same class
	
	public void sum() {// 0 input param
		System.out.println("sum method --zero param");
		
		
	}
	
	public void sum(double d) {//1 input param
		System.out.println("sum method");
	}
	
	public void sum(int i) {//1 input param
		System.out.println("sum method");
	}
	
	public void sum(int k, int l) {//2 input param
		System.out.println("sum method");
	}
	
	

}
