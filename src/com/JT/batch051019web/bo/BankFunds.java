package com.JT.batch051019web.bo;

public abstract class BankFunds {
	
	// looks like class preceding with abstract key word and atlest one abstract method should have also it can have class type of variables and methods
	
	int a=10;
	String name="AMZ";
	
	public void F1() {
		System.out.println("i can help you on F1 related quaries");
	}
	public void F2() {
		System.out.println("i can help you on F2 related quaries");
	}
	public void F3() {
		System.out.println("i can help you on F3 related quaries");
	}
	
	public abstract void fundsIntrest();
	
}
