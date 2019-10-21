package com.JT.batch051019web.corejava;

public class Modifiers {
	// Private : class level, you can access method/variable with in the class.
	// default : with in Package level, you can access method/variable with in the class & package.
	// protected : class, Package level, subclass in different package ,  you can access method/variable with in the class, package & subclass.
	// public : application level, any where you can access.
	
	String name = "AMZ";
	private double homeloanintrest = 8.5;
	public double carloanintrest = 10;
	private double goldloanintrest = 1;
	public String address = "Seegehalli, Bangalore";
	protected float maxloanamount = 1000000;

	public void bank() {
		System.out.println("Welcome to "+name+" Bank, We Support below Depts");
		System.out.println("Deposits");
		System.out.println("wothdraw");
		System.out.println("loans");
		createnewaccount();
		car(123);//metohd1
		
	}
	//customer(cid,phone,pin,amount)
	public void car() {
		System.out.println("car with black color and with no camera");
	}
	
	public void car(int pin) {
		System.out.println("car with black color and with no camera: "+pin);
	}
	
	public void car(String name) {
		System.out.println("car with black color and with no camera: "+ name);
	}
	
	
	private void createnewaccount() {
		System.out.println("New account Created with Account ID: 20062520122");
	}
	
	void deposit() {
		System.out.println("Deposited amount: 1000");
	}
	
	protected void deposit1() {
		System.out.println("Deposited amount: 1000");
	}
	
	public void withdraw() {
		System.out.println("Withdraw Amount: 500");
	}

	public void loans() {
		System.out.println("Welcome to AMZ Bank Loans Section");
		interest();
	}

	private void interest() {
		System.out.println("House Loan Interest Rate : "+homeloanintrest);
		System.out.println("Car Loan Interest Rate : "+carloanintrest);
		System.out.println("Gold Loan Interest Rate : "+goldloanintrest);
	}
	
}
