package javabasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

		int[] numbers = { -10, 24, 50, -88, 987534 };
		int[] numbers1 = { -100, 24, -50, -88, -987534 };
		int[] numbers2 = { 10 };
		int[] numbers3 = { 5, 5 };
		int[] numbers4 = { 1};

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("\n given arry is:" + Arrays.toString(numbers));

		System.out.println("largest number is:" + largest);

		System.out.println("smallest number is:" + smallest);

		System.out.println("****************");

		int largest1 = numbers1[0];
		int smallest1 = numbers1[0];

		for (int i = 1; i < numbers1.length; i++) {

			if (numbers1[i] > largest1) {
				largest1 = numbers1[i];
			} else if (numbers1[i] < smallest1) {
				smallest1 = numbers1[i];
			}
		}
		System.out.println("\n given arry is:" + Arrays.toString(numbers1));

		System.out.println("largest number is:" + largest1);

		System.out.println("smallest number is:" + smallest1);

		System.out.println("****************");

		int largest2 = numbers2[0];
		int smallest2 = numbers2[0];

		for (int i = 1; i < numbers2.length; i++) {

			if (numbers2[i] > largest2) {
				largest2 = numbers2[i];
			} else if (numbers2[i] < smallest2) {
				smallest2 = numbers2[i];
			}
		}

		System.out.println("\n given arry is:" + Arrays.toString(numbers2));

		System.out.println("largest number is:" + largest2);

		System.out.println("smallest number is:" + smallest2);

		System.out.println("****************");

		int largest3 = numbers3[0];
		int smallest3 = numbers3[0];

		for (int i = 1; i < numbers3.length; i++) {

			if (numbers3[i] > largest3) {
				largest3 = numbers3[i];
			} else if (numbers3[i] < smallest3) {
				smallest3 = numbers3[i];
			}
		}
		System.out.println("\n given arry is:" + Arrays.toString(numbers3));

		System.out.println("largest number is:" + largest3);

		System.out.println("smallest number is:" + smallest3);

		System.out.println("****************");

		int largest4 = numbers4[0];
		int smallest4 = numbers4[0];

		for (int i = 1; i < numbers4.length; i++) {

			if (numbers4[i] > largest4) {
				largest4 = numbers4[i];
			} else if (numbers4[i] < smallest4) {
				smallest4 = numbers4[i];
			}
		}
		System.out.println("\n given arry is:" + Arrays.toString(numbers4));

		System.out.println("largest number is:" + largest4);

		System.out.println("smallest number is:" + smallest4);
	}

}
