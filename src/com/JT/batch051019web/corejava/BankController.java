package com.JT.batch051019web.corejava;

import java.sql.SQLException;

import com.JT.batch051019web.dao.DbUtilities;

public class BankController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Modifiers mf=new Modifiers();
		DbUtilities bu=new DbUtilities();
		//System.out.println("Bank Name: "+ mf.name);
		//System.out.println("Bank Max Loan Amount: "+ mf.maxloanamount);
		//mf.bank();
		//mf.loans();
		mf.car("BMW"); //customer: cid,name,pin,orders,city,country
		mf.car();
		bu.getCustomerData(1234);
		
	}
}
