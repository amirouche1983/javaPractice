package ListConcept;

import java.io.ObjectInputStream.GetField;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		
		//it is similar to hashmap , but it is synchronized
		//stores the value on the basis of key -value
		//key --> object --HashCod--> value
		
		
		Hashtable h1  = new Hashtable();
		
		h1.put(1, "Tom");
		
		h1.put(2, "Test");
		
		h1.put(3, "Java");
		
		
		//create a clone copy / shallow copy:
		
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone();
		
		System.out.println("the value  from h1:"+ h1);
		System.out.println("the value  from h2:"+ h2);
		
		
		
		h1.clear();
		
		System.out.println("the value  from h1:"+ h1);
		System.out.println("the value  from h2:"+ h2);
		
	Hashtable st = new Hashtable<>();
		
		st.put("A", "Amar");
		st.put("B", "manager");
		st.put("C", "selenium");
		
		if(st.contains("Amar"))
		System.out.println("value is found");
		
		//print all the values from the hashtable using -- Enumeration--elements()
		
		Enumeration e =st.elements();
		
		System.out.println(e.nextElement());
		System.out.println("print values from st");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		//get all the values from hashtable using --entrySet()--set of hashtable values:
		
		System.out.println("print values from st using entry set");
		Set s =st.entrySet();
		System.out.println(s);
		
		
		//contains value:
		
		Hashtable st1 = new Hashtable<>();
		
		st1.put("A", "Amar");
		st1.put("B", "manager");
		st1.put("C", "selenium");
		st1.put("C", "selenium");//it contains only unique value
		//no null and null values
		//st1.("D", null);//null pointer exception
		
		System.out.println("values from st1");
		System.out.println(st1);
		
		
		//check both  the  hashtables are equal or not:
		if(st.equals(st1));
		System.out.println("both are equal");
		//get the value from a key:
		System.out.println(st1.get("A"));
		
		//get the  hashCode of hashtable object:
		System.out.println("the hash code value of st1 : "+ st1.hashCode());
		
		//generics:
		Hashtable<String, String> st3= new Hashtable<String, String>();
		
		
		
		
		
		
	}

}
