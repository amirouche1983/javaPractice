package javabasics;

public class ForLoopAndWhile {

	public static void main(String[] args) {
        //1, while loop:
		//Dis-advantage of while loop : it will generate infinite loop if we don't give incremental /dicremental part
		
		int s = 1;
		while (s <= 10) {
			System.out.println(s);
			s = s + 1;// if we don't put this condition the loop will not stop
		}
		System.out.println("**********");
        //
		for (int i = 1; i <= 10; i++) {// initialization;conditional;incremental
			System.out.println(i);
		}

		// print 10 to 1
		// 10 9 8 7 6 5 4 3 2 1
		System.out.println("************");
		for (int k = 10; k >= 1; k--) {
			System.out.println(k);
		}

		System.out.println("***********");
		// print from 10 to -10
		for (int j = 10; j >= -10; j--) {
			System.out.println(j);
		}
		
		}
	
	
	
	
	
	

}
