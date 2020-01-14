package javabasics;

import java.util.Scanner;

public class IfElseCondition {
	static int numb1;
	static int numb2;
	static int numb3;
	static Scanner myscan=new Scanner(System.in);
     public static void getInput() {
    	
    	 System.out.println("enter numb1");
    	  numb1=myscan.nextInt();
    	 System.out.println("enter numb2");
    	 numb2=myscan.nextInt();
    	 System.out.println("enter numb3");
    	  numb3=myscan.nextInt();

    	  if(numb1>numb2 &  numb1>numb3) {
    			System.out.println("numb1 is the greatest");
    		}else if(numb2>numb3) {
    			System.out.println("numb2 is the greatest");
    		}else {
    			System.out.println("numb3 is the greatest");
    		}
    			
    			
    		}
     
     public static void exitProgramme() {
    	 System.out.println("by by thank you....");
     }
     
	public static void main(String[] args) {
for(int i=0; i<10; i++) {
		
	getInput();
	
	String doYouWantToContinue;
	Scanner amarascan=new Scanner(System.in);
	System.out.println("do You Want To Continue...");
	doYouWantToContinue= amarascan.nextLine();
	amarascan.close();
	if(doYouWantToContinue.equals("no")) {
		break;
	}
}exitProgramme();
}

}