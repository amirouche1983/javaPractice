package javabasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		//HashMap is a class implement map interface
		//extends AbstractMap
		//it contains only unique elements
		//stores the values --key--value pair
		//it may have one null key and multiple null values
		//it maintains no order no indexing
		//HashMap is non-Synchronized --not thread safe
		//concurrent modification exception -- Fail-Fast condition
		
		
		//creating the object of HashMap:
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		//how to store keys and values
		hm.put(1, "selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestCompet");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		//how to print all the values
		
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 25, "admin");
		
		Employee e2 =new Employee("Peter", 26, "QA");
		
		Employee e3 =new Employee("Stev", 27, "Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap:
		
		for(Entry<Integer, Employee> m : emp.entrySet()) {
			
			
			int key = m.getKey();
			
			Employee e = m.getValue();
			
			System.out.println("Employee " + key + "info: ");
			
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}

	}

}
