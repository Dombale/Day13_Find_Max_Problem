package com.blz;

public class FindMaximumProblem {

	/*
	 * Extend the max method to also print the max to std out using Generic Method
	 */

	public static Integer maxInteger(Integer a, Integer b, Integer c) {
		Integer max = a;// assume a is initially largest
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;

		System.out.println("First Number= " + a);
		System.out.println("Second Number= " + b);
		System.out.println("Third Number= " + c);
		System.out.println("Maximum Value is= " + max);
		return max;
	}

	// main method
	public static void main(String[] args) {
		System.out.println("Welcome..!!");
		// Calling method with Integer argument
		FindMaximumProblem.maxInteger(7, 10, 9);
	}
}