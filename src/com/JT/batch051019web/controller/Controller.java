package com.JT.batch051019web.controller;

import com.JT.batch051019web.bo.Bank;
import com.JT.batch051019web.bo.BankFunds;
import com.JT.batch051019web.boimpl.BankFundsImpl;
import com.JT.batch051019web.boimpl.BankImpl;
import com.JT.batch051019web.corejava.CoreJavaExamples;
import com.JT.batch051019web.corejava.Modifiers;

public class Controller {
	public static void main(String[] args) {
//		Modifiers mf=new Modifiers();
//		mf.bank();
//		mf.loans();
		
		//Bank b=new Bank(); //we cannot create obj/instance for interface directly
		//BankFunds b1=BankFunds(); //we cannot create obj/instance for abstract class directly
		Bank b=new BankImpl();
		b.deposit();
		
		BankFunds b1=new BankFundsImpl();
		b1.F3();
		b1.fundsIntrest();
	}
}
