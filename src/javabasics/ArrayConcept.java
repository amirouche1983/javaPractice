package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
        // ONE DIMENSIONAL ARRAY
		
		// array : to store similar data values in a array variable

		// 1. int array

		// lowest bound index =0
		// upper bound index = n-1 (n is the size of array)

		// one dim array
		// dis-advantages of array :
		// 1. size is fixed --static array --to overcome this problem we use collection
		// -- Arraylist Hashtable hashmap --use dynamic array concept
		// 2. store only similar data type --to overcome this problem, we use Object
		// array

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[1]);
		System.out.println(i[3]);

		// System.out.println(i[4]); ArrayIndexOutOfBoundsException

		System.out.println(i.length);// size/length

		// print all the values of array : use for loop
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("******");
		// 2. double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;

		System.out.println(d[1]);

		for (int r = 0; r < d.length; r++) {
			System.out.println(d[r]);
		}
		// 3. char array:
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = 2;
		c[2] = '$';
		System.out.println(c[2]);

		// 4.boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;

		// 5. string array
		String s[] = new String[3];

		s[0] = "test";
		s[1] = "hello";
		s[2] = "wold";
		System.out.println(s.length);
		System.out.println(s[1]);

		// 6. object array (object is a super class in Java)
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		// Object is used to store different data type values
		System.out.println(ob[5]);
		// if we want to print all the value of Object array we need to use FOR LOOP.

	}

}
