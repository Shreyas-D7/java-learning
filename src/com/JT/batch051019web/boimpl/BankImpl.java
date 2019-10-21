package com.JT.batch051019web.boimpl;

import com.JT.batch051019web.bo.Bank;
import com.JT.batch051019web.bo.BankLoans;

	//class -> class: extends
	//interface -> interface: extends
	//class -> interface: implements

public class BankImpl implements Bank,BankLoans{

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("i ma from create account method......");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("i ma from deposit method......");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("i ma from withdraw method......");
	}

	@Override
	public void homeLoans() {
		// TODO Auto-generated method stub
		System.out.println("i ma from home loan method......");
	}

	@Override
	public void carloans() {
		// TODO Auto-generated method stub
		System.out.println("i ma from car loan method......");
	}

	
}
