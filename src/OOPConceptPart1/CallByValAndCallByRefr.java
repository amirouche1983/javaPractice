package OOPConceptPart1;

public class CallByValAndCallByRefr {

	int p;
	int q;
	
	
	public static void main(String[] args) {
		

		CallByValAndCallByRefr obj = new CallByValAndCallByRefr();
		//int x = 10;
	//	int y = 20;
		// obj.testSum(x, y);//call by value OR pass by value
		 obj.p=50;
		 obj.q =60;
		 
		 obj.swap(obj);
		 //after swap
		 System.out.println(obj.p);
		 System.out.println(obj.q);
	}

	
	/*public int testSum(int a , int b) {
		a=30;
		b= 40;
		
		int c =a+b ;
		return c;
		
	}*/
	  //call by refrence
	public void swap(CallByValAndCallByRefr t) {
		
		int temp;
		temp = t.p;//temp =50
		t.p = t.q;//t.q =60
		t.q =temp; // t.p =50
		
	}
}
