package javabasics;

public class Practice2 {

	public static void main(String[] args) {
		int x = 8;
		for (int i = 0; i < 10; i++) {
		int y = i + 1;
			int c = x * y;
		System.out.println(x + "*" + (i + 1) + "=" + c);
		}

		System.out.println("***********");
	
		int d = 1;

		while (d<= 10) {
			int d1 = 8;
			int j = d1 * d;
			System.out.println(d + "*" + d1 + "=" + j);
			d = d + 1;
		}

	}
}
