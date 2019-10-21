package com.JT.batch051019web.corejava;

public class CoreJavaExamples {

	// signle line comment
	/*
	 * Multi line comment
	 */
	int a = 100; // Global Variable :
	static int b = 50; // Global Variable
	String name = "James Gosling"; // String literal Global Variable
	static CoreJavaExamples tc; // Instance Variable
	public static int ABC = 100; // Final/Constant Global Variable

	String name1 = new String("Java"); // String Object

	public void addTwoNumbers() {
		tc = new CoreJavaExamples();
		int c = 50; // Local Variable
		System.out.println("My name is : " + name);
		System.out.println("Value of A : " + a);
	}

	public static void getVillage() {
		tc = new CoreJavaExamples();
		String village = "Hi-tech City"; // Local Variable
		System.out.println("Name of the village: " + village);
	}

	public static void main(String[] args) {
		tc = new CoreJavaExamples();
		tc.addTwoNumbers();
		// getVillage(); // Method1: static method calling
		CoreJavaExamples.getVillage(); // Method1:2: static method calling
		System.out.println("sum of two numbers: " + (tc.a + b));

		System.out.println("Sub of two numbers: " + (tc.a - b));

	}

}
