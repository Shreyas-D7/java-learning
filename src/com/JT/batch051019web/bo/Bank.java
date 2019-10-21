package com.JT.batch051019web.bo;

public interface Bank {
	// looks like a class preceding with interface keyword
	// variables: public static final int x=10;
	// methods: public abstract void deposit();
	public static final double amount = 1000;

	public abstract void createAccount();

	public abstract void deposit();

	public abstract void withdraw();

}
